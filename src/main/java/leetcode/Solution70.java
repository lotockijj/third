package leetcode;

public class Solution70 {

    public int climbStairs(int n) {
        int current = 1;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            int oneMore = current;
            current = current + temp;
            temp = oneMore;

        }
        return current;
    }
}
