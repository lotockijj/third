package org.example.codilitty.contest;

public class FloodDepth {

    //33% (33%/33% correctness/performance )
    //50% (100%/0% correctness/performance )
    //41% (100%/0% correctness/performance )
    //100%
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length < 3) return 0;
        int result = 0;
        int count = 0;
        int firstMax = A[0];
        int min = A[0];
        //1,3,2,1,2,1,5,3,3,4,2
        //1,3,2,1,5,3,1,4,2
        for (int i = 1; i < A.length; i++) {
            if(A[i] > firstMax && count == 0){
                firstMax = A[i];
            } else if(A[i] < min){
                min = A[i];
                count++;
            } else if(count == 0){
                min = A[i];
                count++;
            } else if(A[i] > min){
                if(firstMax > A[i]){
                    result = Math.max(A[i] - min, result);
                } else {
                    result = Math.max(firstMax - min, result);
                    firstMax = A[i];
                    count = 0;
                }
            }
        }
        return result;
    }

}
