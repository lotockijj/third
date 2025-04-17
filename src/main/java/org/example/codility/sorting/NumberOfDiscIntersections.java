package org.example.codility.sorting;

public class NumberOfDiscIntersections {

    public int solution(int[] A){ //1, 5, 2, 1, 4, 0
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if(i != j){
                    if(i + A[i] >= j - A[j]) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
