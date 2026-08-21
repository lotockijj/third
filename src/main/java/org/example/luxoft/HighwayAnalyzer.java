package org.example.luxoft;

import java.time.Duration;
import java.util.*;
import java.util.stream.Collectors;

public class HighwayAnalyzer {

    public List<Journey> findJourneys(LogFile logFile) {

        Map<String, List<LogEntry>> byCar =
                logFile.getEntries().stream()
                        .collect(Collectors.groupingBy(LogEntry::plate));

        List<Journey> journeys = new ArrayList<>();

        for (List<LogEntry> carEntries : byCar.values()) {

            carEntries.sort(Comparator.comparing(LogEntry::timestamp));

            LogEntry entry = null;

            for (LogEntry log : carEntries) {

                if ("ENTRY".equals(log.type())) {
                    entry = log;
                } else if ("EXIT".equals(log.type()) && entry != null) {

                    journeys.add(new Journey(
                            log.plate(),
                            entry,
                            log
                    ));

                    entry = null;
                }
            }
        }

        return journeys;
    }

    public double calculateAverageSpeed(Journey journey) {

        int distance = Math.abs(
                journey.exit().checkpointKm()
                        - journey.entry().checkpointKm()
        );

        long seconds = Duration.between(
                journey.entry().timestamp(),
                journey.exit().timestamp()
        ).getSeconds();

        if (seconds <= 0) {
            return 0;
        }

        double hours = seconds / 3600.0;

        return distance / hours;
    }

    public long countJourneys(LogFile logFile) {
        return findJourneys(logFile).size();
    }

    public long countJourneysAboveSpeed(
            LogFile logFile,
            double speedLimit
    ) {
        return findJourneys(logFile).stream()
                .filter(journey ->
                        calculateAverageSpeed(journey) > speedLimit)
                .count();
    }

    public long countAllJourneys(LogFile logFile) {

        Map<String, List<LogEntry>> byCar =
                logFile.getEntries().stream()
                        .collect(Collectors.groupingBy(LogEntry::plate));

        long count = 0;

        for (List<LogEntry> carEntries : byCar.values()) {

            carEntries.sort(Comparator.comparing(LogEntry::timestamp));

            boolean entered = false;

            for (LogEntry log : carEntries) {

                if ("ENTRY".equals(log.type())) {
                    entered = true;

                } else if ("EXIT".equals(log.type()) && entered) {
                    count++;
                    entered = false;
                }
            }
        }

        return count;
    }
}
