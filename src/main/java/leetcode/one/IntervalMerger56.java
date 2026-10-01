package leetcode.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntervalMerger56 {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[][]{};
        }
        Arrays.sort(intervals, (Comparator
                .comparingInt((int[] a) -> a[1])
                .thenComparingInt(a -> a[0])));
        List<int[]> tempRes = new ArrayList<>();
        tempRes.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = tempRes.get(tempRes.size() - 1);
            int[] currentInterval = intervals[i];
            if (currentInterval[0] < interval[0] && currentInterval[1] > interval[1]) {
                reduceBack(tempRes, interval, currentInterval);
            } else if (interval[0] > currentInterval[0] && interval[1] == currentInterval[1]) {
                interval[0] = currentInterval[0];
            } else if (interval[1] <= currentInterval[1] && interval[1] >= currentInterval[0]) {
                interval[1] = currentInterval[1];
            } else {
                tempRes.add(currentInterval);
            }
        }
        return tempRes.toArray(new int[tempRes.size()][]);
    }

    private void reduceBack(List<int[]> tempRes, int[] interval, int[] currentInterval) {
        while (currentInterval[0] < interval[0] && currentInterval[1] > interval[1] &&
                !tempRes.isEmpty() &&
                (currentInterval[0] < tempRes.get(tempRes.size() - 1)[0] || currentInterval[0] <= tempRes.get(tempRes.size() - 1)[1]) &&
                currentInterval[1] > tempRes.get(tempRes.size() - 1)[1]) {
            if (currentInterval[0] != tempRes.get(tempRes.size() - 1)[1]) {
                if (currentInterval[0] > tempRes.get(tempRes.size() - 1)[0]) {
                    currentInterval[0] = tempRes.get(tempRes.size() - 1)[0];
                }
                tempRes.remove(tempRes.size() - 1);
            } else {
                int temp = tempRes.get(tempRes.size() - 1)[0];
                tempRes.remove(tempRes.size() - 1);
                currentInterval[0] = temp;
            }
        }
        tempRes.add(currentInterval);
    }
}
