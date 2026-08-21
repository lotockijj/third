package org.example.luxoft;

public record Journey(
        String plate,
        LogEntry entry,
        LogEntry exit
) {
}
