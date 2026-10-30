package leetcode.one;

public class Solution75 {

    public void sortColors(int[] nums) {
        int fIndex = 0;
        int sIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n == 0) {
                fIndex++;
            } else if (n == 1) {
                sIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i < fIndex) {
                nums[i] = 0;
            } else if (i < sIndex + fIndex) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
