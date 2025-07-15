package leetcode.one;

public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        int result = 0;
        int mid = nums.length/2;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            if(nums[mid] > target){
                end = mid - 1;
                mid = (start + end)/2;
            } else if(nums[mid] < target){
                start = mid + 1;
                mid = (start + end)/2;
            } else {
                result = mid;
                break;
            }
            if(start == end){
                result = mid;
            } else if(start > end){
                result = start;
            }
        }
        return result;
    }
}
