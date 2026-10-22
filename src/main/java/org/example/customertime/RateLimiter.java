package org.example.customertime;

import java.time.Clock;
import java.util.ArrayDeque;
import java.util.Deque;

public class RateLimiter {

    private static final int MAX_REQUESTS = 100;
    private static final long WINDOW_MILLIS = 1_000;

    private final Deque<Long> requestTimes = new ArrayDeque<>();
    private final Clock clock;

    public RateLimiter() {
        this(Clock.systemUTC());
    }

    RateLimiter(Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean allowRequest() {
        long now = clock.millis();
        long windowStart = now - WINDOW_MILLIS;

        while (!requestTimes.isEmpty()
                && requestTimes.peekFirst() <= windowStart) {
            requestTimes.removeFirst();
        }

        if (requestTimes.size() >= MAX_REQUESTS) {
            return false;
        }

        requestTimes.addLast(now);
        return true;
    }
}