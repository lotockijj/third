package org.example.training;

public class LeetCodeSqrt69 {

    public int mySqrt(int x) {
        if(x == 0) return 0;
        if(x <= 3){
            return 1;
        }
        long result = 2;
        for (long i = 1; i < x / 2; i++) {
            if (i * i > x) {
                break;
            } else {
                result = result > i ? result : i;
            }
        }
        return (int) result;
    }
}
