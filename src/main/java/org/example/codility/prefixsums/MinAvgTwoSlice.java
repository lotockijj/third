package org.example.codility.prefixsums;

public class MinAvgTwoSlice {

    // todo only 70% achieved
    public int solution(int[] A){
        int result = 0;
        double minAvg = 0;
        double min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            if(i + 1 < A.length){
                minAvg = A[i] + A[i + 1] / (double) 2;
                if(minAvg < min){
                    result = i;
                    min = minAvg;
                }
            }
        }
        return result;
    }
}
