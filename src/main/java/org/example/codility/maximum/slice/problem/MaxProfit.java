package org.example.codility.maximum.slice.problem;

public class MaxProfit {

    //todo 88% two_hills two increasing subsequences✘WRONG ANSWER got 3000 expected 99000
    public int solution(int[] A){
        // Implement your solution here
        if(A.length < 2) return 0;
        if(A.length == 2 && A[0] < A[1]) return A[1] - A[0];
        int min = A[0];
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            min = Math.min(min, A[i]);
            if(i + 1 < A.length){
                result = Math.max(A[i + 1] - min, result);
            }
        }
        return result;
    }
}
