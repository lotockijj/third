package org.example.codility.caterpillar.method;

import java.util.Arrays;

public class CountTriangles {

    //72% , due to performance
    public int solution(int[] A){
        if(A.length < 3) return 0;
        int result = 0;
        Arrays.sort(A); //1, 2, 5, 8, 10, 12, 21
        for (int i = 0; i < A.length - 2; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if(A[i] + A[j] > A[k]){
                        result++;
                    } else {
                        break;
                    }
                }
            }
        }
        return result;
    }
}
