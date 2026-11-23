package leetcode.one;

public class Solution81 {

    /*
        Input: nums = [2,5,6,0,0,1,2], target = 0
        Output: true
     */
    public boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if(target == nums[pivot] || target == nums[nums.length - 1]){
            return true;
        } else if (target > nums[pivot] && target < nums[nums.length - 1]) {
            return binarySearch(nums, pivot, nums.length - 1, target);
        } else if (target >= nums[0] && pivot >= 1 && target <= nums[pivot - 1]) {
            return binarySearch(nums, 0, pivot - 1, target);
        }
        return false;
    }

    private boolean binarySearch(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }

    //2, 5, 6, 0, 0, 1, 2
    public int findPivot(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i + 1;
            }
        }
        return 0;
    }
}
