package org.example.codilitty.algorithmic.skills;

public class ArrayInversionCount {

    //todo 63%(100%/20% correctness/performance
    //todo 63%(100%/20% correctness/performance
    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;
        //-1,6,3,4,7,4
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    result++;
                }
            }
            if(result > 1_000_000_000) {
                result = -1;
                break;
            }
        }
        return result;
    }
}
