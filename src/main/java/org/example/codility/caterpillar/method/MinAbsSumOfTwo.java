package org.example.codility.caterpillar.method;

import java.util.Arrays;

public class MinAbsSumOfTwo {

    //for sure right, however a better performance solution exists.
    //todo only 54% achived
    public int solution(int[] A){
        //-10,-8, 3, 4, 5
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        if(A[i] > 0){
            return solutionForPositiveNumbers(A);
        }
        int min = Math.abs(A[i] + A[A.length - 1]);
        while(i <= j){
            int tempMin = Math.abs(A[i] + A[j]);
            min = Math.min(min, tempMin);
            if(i + 1 < A.length && j - 1 >= 0 && Math.abs(A[i + 1] + A[j - 1]) > min){
                j--;
            } else {
                i++;
            }
        }
        return min;
    }

    private int solutionForPositiveNumbers(int[] A){
        //-10,-8, 3, 4, 5
        if(A.length == 0) return 0;
        int min = Math.abs(A[0] + A[A.length - 1]);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                min = Math.min(min, Math.abs(A[i] + A[j]));
            }
        }
        return min;
    }
}

/*
for sure right, however a better performance solution exists.
public int solution(int[] A){
        //-10,-8, 3, 4, 5
        if(A.length == 0) return 0;
        int min = Math.abs(A[0] + A[A.length - 1]);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                min = Math.min(min, Math.abs(A[i] + A[j]));
            }
        }
        return min;
    }

    //45%
    public int solution(int[] A){
        //-10,-8, 3, 4, 5
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        int min = Math.abs(A[i] + A[A.length - 1]);
        while(i <= j){
            int tempMin = Math.abs(A[i] + A[j]);
            min = Math.min(min, tempMin);
            if(i + 1 < A.length && j - 1 >= 0 && Math.abs(A[i + 1] + A[j - 1]) > min){
                j--;
            } else {
                i++;
            }
        }
        return min;
    }
 */
