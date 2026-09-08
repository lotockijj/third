package org.example.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonOverlappingMeetingTest {

    private NonOverlappingMeeting overlappingMeeting;

    @BeforeEach
    void setUp() {
        overlappingMeeting = new NonOverlappingMeeting();
    }

    @Test
    void maxMeetings() {
        int[][] intervals = {{0, 30}, {5, 10}, {15, 20}};
        int[][] intervals2 = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};
        int[][] intervals3 = {{1, 100}, {2, 3}, {4, 5}};

        assertEquals(2, overlappingMeeting.maxMeetings(intervals));
        assertEquals(3, overlappingMeeting.maxMeetings(intervals2));
        assertEquals(2, overlappingMeeting.maxMeetings(intervals3));
    }

    @Test
    void maxMeetings2() {
        int[][] intervals = {{1, 2}, {2, 3}, {3, 4}, {1, 3}};

        assertEquals(3, overlappingMeeting.maxMeetings(intervals));
    }
}