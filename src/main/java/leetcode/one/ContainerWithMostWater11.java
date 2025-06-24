package leetcode.one;

public class ContainerWithMostWater11 {

    public int maxArea(int[] height) { // 1, 8, 6, 2, 5, 4, 8, 3, 7
        if (height.length <= 1) return 0;
        int result = 0;
        int beggingIndex = 0;
        int endIndex = height.length - 1;
        while (beggingIndex <= endIndex){
            int len = endIndex - beggingIndex ;
            int i = height[beggingIndex];
            int j = height[endIndex];
            result = Math.max(result, len * Math.min(i, j));
            if(i > j){
                endIndex--;
            } else {
                beggingIndex++;
            }
        }
        return result;
    }

    //Time Limit Exceeded
    public int maxArea2(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                if (i != j) {
                    int firstMax = height[i];
                    int secondMax = height[j];
                    int tempResult = (j - i) * Math.min(firstMax, secondMax);
                    result = Math.max(result, tempResult);
                }
            }
        }
        return result;
    }

    public int maxArea3(int[] height) {
        if (height.length <= 1) return 0;
        int result = 0;
        int maxValue = height[0];
        int tempMax;
        int count = 0;
        for (int i = 1; i < height.length; i++) {
            count++;
            int h = height[i];
            tempMax = Math.min(maxValue, h);
            int area = count * tempMax;
            result = Math.max(result, area);
            if (h > maxValue) {
                maxValue = h;
                count = 0;
            }
        }
        return result;
    }
}
