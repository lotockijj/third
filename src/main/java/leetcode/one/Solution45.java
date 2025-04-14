package leetcode.one;

public class Solution45 {

    public static int getJumpGameTwo(int[] arr){
        int steps = 0;
        int max = arr[0];
        int end;
        for (int i = 1; i < arr.length; i++) {
            end = max;
            max = Math.max(max, arr[i]);
            if(end < max){
                steps++;
            }
        }
        return steps;
    }
}
