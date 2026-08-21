package org.example.luxoft;

/*
Possible Luxoft live coding task

You have a highway with checkpoints every 10 km.

Cars generate log records when they ENTER or EXIT the highway.

Each log entry contains:
- car plate number
- direction/type: "ENTRY" or "EXIT"
- timestamp
- checkpoint position in km

You are given a LogFile, which contains a list of LogEntry objects.

You need to calculate:

1. How many complete journeys were made by all cars.

A complete journey means:
- same car plate
- one ENTRY log
- followed by one EXIT log

2. How many journeys had an average speed greater than 130 km/h.

3. How many journeys had an average speed greater than 120 km/h.

Average speed:

speed = distance / time

Example:
ENTRY at km 0 at 10:00
EXIT at km 30 at 10:15

distance = 30 km
time = 15 minutes = 0.25 hours

speed = 30 / 0.25 = 120 km/h
*/

import jakarta.annotation.Nonnull;

import java.time.LocalDateTime;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LogFile logFile = getLogFile();

        HighwayAnalyzer analyzer = new HighwayAnalyzer();

        System.out.println("All journeys: " + analyzer.countAllJourneys(logFile));
        System.out.println("Above 130 km/h: " + analyzer.countJourneysAboveSpeed(logFile, 130));

        System.out.println("Above 120 km/h: " + analyzer.countJourneysAboveSpeed(logFile, 120));
    }

    @Nonnull
    private static LogFile getLogFile() {
        List<LogEntry> entries = List.of(

                // 150 km/h -> above 130 and above 120
                new LogEntry(
                        "AA1111BB",
                        "ENTRY",
                        0,
                        LocalDateTime.of(2026, 8, 21, 10, 0)
                ),
                new LogEntry(
                        "AA1111BB",
                        "EXIT",
                        30,
                        LocalDateTime.of(2026, 8, 21, 10, 12)
                ),

                // 125 km/h -> above 120, but not above 130
                new LogEntry(
                        "CC2222DD",
                        "ENTRY",
                        0,
                        LocalDateTime.of(2026, 8, 21, 11, 0)
                ),
                new LogEntry(
                        "CC2222DD",
                        "EXIT",
                        25,
                        LocalDateTime.of(2026, 8, 21, 11, 12)
                ),

                // incomplete journey -> MUST NOT be counted
                new LogEntry(
                        "EE3333FF",
                        "ENTRY",
                        10,
                        LocalDateTime.of(2026, 8, 21, 12, 0)
                )
        );

        return new LogFile(entries);
    }
}