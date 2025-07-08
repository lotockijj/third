package leetcode.one;

public class TwoIntDevision29 {

    public int divide(int dividend, int divisor) {
        if(dividend <= Integer.MIN_VALUE && divisor == -1){
            return 2147483647;
        } else if(dividend <= Integer.MIN_VALUE && divisor == 1){

        }
        return dividend/divisor;
    }
}
