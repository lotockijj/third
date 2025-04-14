package leetcode.one;

import org.junit.jupiter.api.Test;

class Solution39Test {

    @Test
    void getCombinationSum() {
        int[][] combinationSum = Solution39.getCombinationSum(new int[]{2, 3, 6, 7}, 7);
        for (int i = 0; i < combinationSum.length; i++) {
            for (int j = 0; j < combinationSum[i].length; j++) {
                System.out.print(combinationSum[i][j] + ",   ");
            }
            System.out.println();
        }
    }
}