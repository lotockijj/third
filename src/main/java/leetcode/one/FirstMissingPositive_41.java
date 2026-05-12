package leetcode.one;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive_41 {

    public int firstMissingPositive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 1;
        }
        if (nums.length == 1) {
            if (nums[0] == 1) {
                return 2;
            } else if (nums[0] > 1) {
                return 1;
            }
        }
        Set<Integer> result = new HashSet<>();
        Set<Integer> uniqueNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            result.add(i + 1);
            uniqueNums.add(nums[i]);
        }
        result.removeAll(uniqueNums);
        return result.isEmpty() ? nums.length + 1 : result.stream().min(Integer::compareTo).get();
    }
}
