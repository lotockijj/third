package leetcode.one;

public class TrappingRainWater42 {

    //0,1,0,2,1,0,1,3,2,1,2,1
    public int trap(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int firstTop = 0;
        int secondTop = 0;
        int result = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= firstTop) {
                    firstTop = height[left];
                } else {
                    result += firstTop - height[left];
                }
                left++;
            } else {
                if (height[right] >= secondTop) {
                    secondTop = height[right];
                } else {
                    result += secondTop - height[right];
                }
                right--;
            }
        }
        return result;
    }
}
