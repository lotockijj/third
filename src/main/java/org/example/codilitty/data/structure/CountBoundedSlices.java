package org.example.codilitty.data.structure;

public class CountBoundedSlices {

    //max(A[P], A[P + 1], ..., A[Q]) − min(A[P], A[P + 1], ..., A[Q]) ≤ K.
    //3,5,7,6,3
    //todo 60% (100% correctness/ 20% performance ! )
    public int solution(int K, int[] A) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            result += countSliceForIndex(A, i, K);
        }
        return result;
    }

    private int countSliceForIndex(int[] A, int index, int K) {
        int result = 1;
        int maxTemp = A[index];
        int minTemp = A[index];
        for (int i = index + 1; i < A.length; i++) {
            maxTemp = Math.max(A[i], maxTemp);
            minTemp = Math.min(A[i], minTemp);
            if (maxTemp - K > minTemp) break;
            result++;
        }
        System.out.println(result);
        return result;
    }
}
