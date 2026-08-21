package org.example.luxoft;

import java.time.LocalDateTime;

public record LogEntry(
        String plate,
        String type,
        int checkpointKm,
        LocalDateTime timestamp
) {
}
