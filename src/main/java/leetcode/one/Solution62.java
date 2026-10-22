package leetcode.one;

import java.util.Arrays;

public class Solution62 {

    public int uniquePaths(int m, int n) {
        int[] steps = new int[n];
        Arrays.fill(steps, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                steps[j] = steps[j] + steps[j - 1];
            }
        }
        return steps[n - 1];
    }
}
