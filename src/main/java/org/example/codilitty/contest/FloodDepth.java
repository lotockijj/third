package org.example.codilitty.contest;

public class FloodDepth {

    //33% (33%/33% correctness/performance )
    //50% (100%/0% correctness/performance )
    //41% (100%/0% correctness/performance )
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length < 3) return 0;
        int result = 0;
        int count = 0;
        int firstMax = A[0];
        int secondMax = A[0];
        int min = A[0];
        //1,3,2,1,2,1,5,3,3,4,2
        //1,3,2,1,5,3,1,4,2
        for (int i = 1; i < A.length; i++) {
            if (A[i] > firstMax && count == 0) {
                firstMax = A[i];
            } else if (A[i] < firstMax) {
                if(A[i] < min){
                    min = A[i];
                } else if(count >= 1){
                    result = Math.max(result, A[i] - min);
                }
                count++;
            } else if (A[i] > min && count >= 1) {
                if (result == 0) {
                    if (A[i] > firstMax) {
                        result = firstMax - min;
                        firstMax = A[i];
                        count = 0;
                    } else {
                        result = A[i] - min;
                    }
                } else {
                    if (A[i] > firstMax) {
                        result = Math.max(result, firstMax - min);
                        firstMax = A[i];
                        min = firstMax;
                        count = 0;
                    } else {
                        result = Math.min(result, A[i] - min);
                    }
                }
            }
        }
        return result;
    }

}
