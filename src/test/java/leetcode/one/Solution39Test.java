package leetcode.one;

import org.junit.jupiter.api.Test;

import java.util.List;

class Solution39Test {

    @Test
    void getCombinationSum1() {
        List<List<Integer>> combinationSum = Solution39.combinationSum(new int[]{2, 3, 6, 7}, 7);
        print(combinationSum);
    }

    @Test
    void getCombinationSum2() {
        List<List<Integer>> combinationSum = Solution39.combinationSum(new int[]{2, 2, 2, 2}, 8);
        print(combinationSum);
    }

    @Test
    void getCombinationSum3() {
        List<List<Integer>> combinationSum = Solution39.combinationSum(new int[]{2, 3, 5}, 8);
        print(combinationSum);
    }

    private static void print(List<List<Integer>> combinationSum) {
        for (int i = 0; i < combinationSum.size(); i++) {
            for (int j = 0; j < combinationSum.get(i).size(); j++) {
                System.out.print(combinationSum.get(i).get(j) + ",   ");
            }
        }
        System.out.println("\n");
    }
}