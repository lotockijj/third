package org.example.codility;

public class TapeEquilibrium {

    public int solution(int[] A){
        int sum = 0;
        int res = A[0];
        int tempRes = res;
        for (int i = 1; i < A.length; i++) {
            sum += Math.abs(A[i]);
        }
        for (int i = 1; i < A.length; i++) {
            int abs = Math.abs(tempRes - sum);
            res = Math.min(abs, res);
            tempRes += A[i];
            sum -= A[i];
        }
        return res;
    }
}
