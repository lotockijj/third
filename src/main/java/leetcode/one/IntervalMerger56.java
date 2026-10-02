package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntervalMerger56 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length < 1) {
            return intervals;
        }
        Arrays.sort(intervals, (Comparator
                .comparingInt((int[] a) -> a[0])
                .thenComparingInt(a -> a[1])));
        List<int[]> tempRes = new ArrayList<>();
        tempRes.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            int[] last = tempRes.get(tempRes.size() - 1);
            if (last[1] >= current[0]) {
                if (last[1] < current[1]) {
                    last[1] = current[1];
                }
            } else {
                tempRes.add(current);
            }
        }
        return tempRes.toArray(new int[tempRes.size()][]);
    }
}
