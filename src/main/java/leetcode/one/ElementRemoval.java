package leetcode.one;

public class ElementRemoval {

    // 0, 1, 2, 2, 3, 0, 4, 2  val 2
    // 0, 1, 4, 0, 3
    public int removeElement(int[] nums, int val) {
        int result = nums.length;
        int lastNotEqualValIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                lastNotEqualValIndex = findLastNotEqualVal(nums, i, val, lastNotEqualValIndex);
                nums[i] = nums[lastNotEqualValIndex];
                result--;
            }
        }
        return result;
    }

    private int findLastNotEqualVal(int[] nums, int start, int val, int result) {
        for (int i = result - 1; i > start; i--) {
            if (nums[i] != val) {
                return i;
            }
        }
        return 0;
    }
}
