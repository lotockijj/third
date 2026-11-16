package leetcode.one;

import java.util.ArrayList;
import java.util.List;

public class Solution78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(0, current, nums, result);
        return result;
    }

    private void backtrack(int start, List<Integer> temp, int[] nums, List<List<Integer>> result) {
        result.add(new ArrayList<>(temp));
        if (temp.size() == nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(i + 1, temp, nums, result);
            temp.remove(temp.size() - 1);
        }
    }
}
