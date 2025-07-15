package leetcode.one;

public class FirstLastElement34 {

    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        boolean firstSet = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && !firstSet) {
                firstSet = true;
                result[0] = i;
                result[1] = i;
            } else if (nums[i] == target) {
                result[1] = i;
            } else if(nums[i] > target){
                break;
            }
        }
        return result;
    }

    public int[] searchRange2(int[] nums, int target) {
        int[] result = {-1, -1};
        int startIndex = 0;
        int endIndex = nums.length - 1;
        boolean endIndexSet = false;
        boolean startIndexSet = false;
        while(startIndex <= endIndex){
            if(!startIndexSet) {
                if (nums[startIndex] < target) {
                    startIndex++;
                } else if (nums[startIndex] == target) {
                    result[0] = startIndex;
                    startIndexSet = true;
                }
            }
            if(!endIndexSet) {
                if (nums[endIndex] > target) {
                    endIndex--;
                } else if (nums[endIndex] == target) {
                    result[1] = endIndex;
                    endIndexSet = true;
                }
            }
            if(startIndexSet && endIndexSet) break;
        }
        return result;
    }
}
