package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class Solution57 {

    /*
        Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
        Output: [[1,5],[6,9]]

        Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        Output: [[1,2],[3,10],[12,16]] 3, 8
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        List<int[]> result = new ArrayList<>();
        boolean used = false;
        if (intervals[0][1] > newInterval[1] && intervals[0][0] > newInterval[0] && intervals[0][0] > newInterval[1]) {
            result.add(newInterval);
            used = true;
        }
        for (int i = 0; i < intervals.length; i++) {
            int[] current = intervals[i];
            if (current[0] <= newInterval[0] && current[1] >= newInterval[1]) {
                used = true;
                result.add(current);
            } else if (used && !result.isEmpty()) {
                int[] ints1 = result.get(result.size() - 1);
                if (current[0] > ints1[1]) {
                    result.add(current);
                } else if (current[0] == ints1[1]) {
                    ints1[1] = current[1];
                } else if (current[1] > ints1[1]) {
                    ints1[1] = current[1];
                }
                continue;
            }
            if (used) {
                if (current[0] >= newInterval[0] && current[1] > newInterval[1] && current[0] == newInterval[1]) {
                    int[] ints = result.get(result.size() - 1);
                    ints[0] = newInterval[0];
                    ints[1] = current[1];
                }
            } else {
                if (current[0] <= newInterval[0]) {
                    if (current[1] < newInterval[0]) {
                        result.add(current);
                    } else if (current[1] > newInterval[0]) {
                        current[1] = newInterval[1];
                        newInterval[0] = current[0];
                        result.add(current);
                        used = true;
                    } else {
                        current[1] = newInterval[1];
                        result.add(current);
                        used = true;
                    }
                } else {
                    if (current[0] > newInterval[1]) {
                        result.add(newInterval);
                        result.add(current);
                        used = true;
                        continue;
                    }
                    if (current[1] > newInterval[1]) {
                        current[0] = newInterval[0];
                        result.add(current);
                        used = true;
                    }
                }
            }
        }
        if (!used) {
            result.add(newInterval);
        }
        return result.toArray(new int[result.size()][]);
    }
}
