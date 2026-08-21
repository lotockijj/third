package org.example.luxoft;

import java.util.List;

public class LogFile {

    private final List<LogEntry> entries;

    public LogFile(List<LogEntry> entries) {
        this.entries = entries;
    }

    public List<LogEntry> getEntries() {
        return entries;
    }
}
