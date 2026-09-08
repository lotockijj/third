package org.example.warmup;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlappingMeeting {

    public int maxMeetings(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int result = 1;
        int lastSeen = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (lastSeen <= intervals[i][0]) {
                result++;
                lastSeen = intervals[i][1];
            }
        }
        return result;
    }
}
