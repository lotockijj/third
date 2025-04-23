package org.example.codility.maximum.slice.problem;

public class MaxSliceSum {

    public int solution(int[] A){
        int result = A[0];
        int firstOccurence = A[0];
        for (int i = 1; i < A.length; i++) {
            firstOccurence = Math.max(A[i], firstOccurence + A[i]);
            result = Math.max(result, firstOccurence);
            //System.out.println("firstOccurence: " + firstOccurence + " ; result: " + result);
        }
        return result;
    }
}
