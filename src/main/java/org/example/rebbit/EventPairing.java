package org.example.rebbit;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class EventPairing {

    public static void main(String[] args) {
        // Test Data
        List<LoginEvent> logins = Arrays.asList(
                new LoginEvent("A", LocalDateTime.of(2025, 1, 1, 10, 0)),  // Duplicate user -> ignored
                new LoginEvent("A", LocalDateTime.of(2025, 1, 1, 10, 5)),  // Duplicate user -> ignored
                new LoginEvent("B", LocalDateTime.of(2025, 1, 1, 10, 0)),  // Valid
                new LoginEvent("C", LocalDateTime.of(2025, 1, 1, 10, 0))   // Valid (but logout is before login)
        );

        List<LogoutEvent> logouts = Arrays.asList(
                new LogoutEvent("B", LocalDateTime.of(2025, 1, 1, 10, 30)), // Valid -> 1800s
                new LogoutEvent("B", LocalDateTime.of(2025, 1, 1, 10, 35)), // Second logout for B (ignored, we take earliest)
                new LogoutEvent("C", LocalDateTime.of(2025, 1, 1, 9, 30)),  // Invalid (before login) -> ignored
                new LogoutEvent("A", LocalDateTime.of(2025, 1, 1, 11, 0))   // Logout for duplicate user -> ignored
        );

        List<UserSession> sessions = pairEvents(logins, logouts);
        sessions.forEach(System.out::println);
    }

    public static List<UserSession> pairEvents(List<LoginEvent> logins, List<LogoutEvent> logouts) {
        // Step 1: Find earliest login per user AND track duplicate users
        Map<String, LocalDateTime> earliestLoginPerUser = new HashMap<>();
        Set<String> duplicateUsers = new HashSet<>();

        for (LoginEvent login : logins) {
            if (earliestLoginPerUser.containsKey(login.userId())) {
                // User has multiple logins -> mark for complete exclusion
                duplicateUsers.add(login.userId());
            } else {
                earliestLoginPerUser.put(login.userId(), login.timestamp());
            }
        }

        // Step 2: Remove ALL users who have multiple logins (as per hint)
        duplicateUsers.forEach(earliestLoginPerUser::remove);

        // Step 3: Pair each valid login with the EARLIEST valid logout
        List<UserSession> result = new ArrayList<>();

        for (Map.Entry<String, LocalDateTime> entry : earliestLoginPerUser.entrySet()) {
            String userId = entry.getKey();
            LocalDateTime loginTime = entry.getValue();

            // Find the earliest logout for this user that happens AFTER the login
            Optional<LocalDateTime> earliestValidLogout = logouts.stream()
                    .filter(l -> l.userId().equals(userId))
                    .map(LogoutEvent::timestamp)
                    .filter(logoutTime -> logoutTime.isAfter(loginTime))
                    .min(LocalDateTime::compareTo); // takes the earliest timestamp

            // If a valid logout exists, create a session
            earliestValidLogout.ifPresent(logoutTime -> {
                long durationSeconds = Duration.between(loginTime, logoutTime).getSeconds();
                result.add(new UserSession(
                        userId,
                        loginTime,
                        logoutTime,
                        (int) durationSeconds
                ));
            });
        }

        // Bonus: Sort by userId for predictable output (optional)
        result.sort(Comparator.comparing(UserSession::userId));
        return result;
    }

    // ---------- Records ----------
    record LoginEvent(String userId, LocalDateTime timestamp) {}

    record LogoutEvent(String userId, LocalDateTime timestamp) {}

    record UserSession(String userId, LocalDateTime startTime, LocalDateTime endTime, int durationInSeconds) {}
}
