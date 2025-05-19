package org.example.codilitty.contest;

public class FloodDepth {

    //33% (33%/33% correctness/performance )
    //50% (100%/0% correctness/performance )
    public int solution(int[] A) {
        // Implement your solution here
        if(A.length < 3) return 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                for (int k = j + 1; k < A.length; k++) {
                    if(i < j && j < k){
                        if(A[i] > A[j] && A[j] < A[k]){
                            int temp = A[i] < A[k] ? A[i] - A[j] : A[k] - A[j];
                            result = Math.max(result, temp);
                        }
                    }
                }
            }
        }
        return result;
    }

}
