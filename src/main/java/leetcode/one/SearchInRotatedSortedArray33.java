package leetcode.one;

public class SearchInRotatedSortedArray33 {

    public int search(int[] nums, int target) {
        int result = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                result = i;
            }

        }
        return result;
    }
}
