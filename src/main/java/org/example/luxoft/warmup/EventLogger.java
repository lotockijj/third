package org.example.luxoft.warmup;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EventLogger {

    public static final String LOGIN = "LOGIN";
    public static final String LOGOUT = "LOGOUT";

    public record LoginEvent(
            String userId,
            String type,
            LocalDateTime timestamp
    ) {
    }

    public static void main(String[] args) {

        List<LoginEvent> loginEvents = getTestData();

        Map<String, List<LoginEvent>> eventsByUserId =
                loginEvents.stream()
                        .collect(Collectors.groupingBy(LoginEvent::userId));

        int totalValidSessions = 0;
        int sessionsLongerThanOneHour = 0;
        int usersWithMoreThanTwoSessions = 0;

        for (List<LoginEvent> userEvents : eventsByUserId.values()) {

            userEvents.sort(Comparator.comparing(LoginEvent::timestamp));

            LoginEvent login = null;
            int userSessionCount = 0;

            for (LoginEvent event : userEvents) {

                if (LOGIN.equals(event.type())) {
                    login = event;

                } else if (LOGOUT.equals(event.type()) && login != null) {

                    totalValidSessions++;
                    userSessionCount++;

                    if (isMoreThanOneHour(
                            login.timestamp(),
                            event.timestamp())) {

                        sessionsLongerThanOneHour++;
                    }

                    login = null;
                }
            }

            if (userSessionCount > 2) {
                usersWithMoreThanTwoSessions++;
            }
        }

        System.out.printf(
                "Total valid sessions: %d%n",
                totalValidSessions
        );

        System.out.printf(
                "Sessions longer than one hour: %d%n",
                sessionsLongerThanOneHour
        );

        System.out.printf(
                "Users with more than two sessions: %d%n",
                usersWithMoreThanTwoSessions
        );
    }

    private static boolean isMoreThanOneHour(
            LocalDateTime start,
            LocalDateTime end
    ) {
        return Duration.between(start, end)
                .compareTo(Duration.ofHours(1)) > 0;
    }

    private static List<LoginEvent> getTestData() {
        return List.of(
                new LoginEvent(
                        "user1",
                        LOGIN,
                        LocalDateTime.of(2026, 8, 21, 10, 0)
                ),
                new LoginEvent(
                        "user1",
                        LOGOUT,
                        LocalDateTime.of(2026, 8, 21, 10, 30)
                ),
                new LoginEvent(
                        "user1",
                        LOGIN,
                        LocalDateTime.of(2026, 8, 21, 12, 0)
                ),
                new LoginEvent(
                        "user1",
                        LOGOUT,
                        LocalDateTime.of(2026, 8, 21, 13, 30)
                )
        );
    }
}