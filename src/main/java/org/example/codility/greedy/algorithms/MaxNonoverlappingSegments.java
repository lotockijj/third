package org.example.codility.greedy.algorithms;

public class MaxNonoverlappingSegments {

    // 0  1  2   3 4
    //   ___     _
    //_____  __  __
    // 100% CHEERS
    public int solution(int[] A, int[] B){
        // Implement your solution here
        /*
        A = 1,3,7,9,9
        B = 5,6,8,9,10
         */
        if(A.length == 0) return 0;
        int result = A.length;
        int aIndex = A[0];
        int bIndex = B[0];
        for (int i = 1; i < A.length; i++) {
            if(areTwoSegmentsOverlapped(aIndex, bIndex, A[i], B[i])){
                result--;
            } else {
                aIndex = A[i];
                bIndex = B[i];
            }
        }
        return result;
    }

    private boolean areTwoSegmentsOverlapped(int aIndex, int bIndex, int a, int b) {
        boolean result = false;
        if(aIndex <= a && bIndex >= a){
            result = true;
        } else if(a <= bIndex && bIndex <= b){
            result = true;
        }
        return result;
    }
}
