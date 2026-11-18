package leetcode.one;

public class Solution80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int result = 2;
        for (int i = 2; i < nums.length; i++) {

            if (nums[i] != nums[result - 2]) {
                nums[result] = nums[i];
                result++;
            }
        }
        return result;
    }
}
