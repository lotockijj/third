package leetcode.one;

import java.util.Arrays;

public class ThreeSumClosest {

    /*
    Given an integer array nums of length n and an integer target,
    find three integers in nums such that the sum is closest to target.
    Return the sum of the three integers.
     */
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int minDiff = Math.abs(result - target);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (target < 0) {
                    if(sum < 0 && Math.abs(sum - target) < Math.abs(minDiff)){
                        minDiff = sum - target;
                        result = sum;
                    }
                } else if (Math.abs(sum - target) < minDiff) {
                    minDiff = Math.abs(sum - target);
                    result = sum;
                }
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                } else {
                    result = sum;
                    break;
                }
            }
        }
        return result;
    }
}
