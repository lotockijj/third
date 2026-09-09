package leetcode.one.corrections;

public class JumpGameTwo45 {

    //2, 3, 1, 1, 4
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0;
        int farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest = Math.max(farthest, i + nums[i]);
            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;
            }
        }
        return jumps;
    }

    public int jump2(int[] nums) {
        return jump(nums, nums[0], 1, 1);
    }

    private int jump(int[] nums, int value, int current, int index) {
        if(nums.length == 1 || value == 0) {
            return 0;
        }
        if(value + current == nums.length || value >= nums.length || index + current >= nums.length) {
            return current;
        }
        if (value + nums[index] >= nums.length-1 ) {
            return ++current;
        } else {
            for (int i = index; i < nums.length && value > 0; i++) {
                current = jump(nums, value, i + 1, ++index);
                value--;
            }
        }
        return current;
    }
}

/*
You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at index i, you can jump to any index (i + j) where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.
 */
