package org.example.codilitty.contest;

public class FloodDepth {

    //33% (33%/33% correctness/performance )
    public int solution(int[] A) {
        // Implement your solution here
        int result = 0;
        int firstMax = A[0];
        int indexOfFirstMax = 0;
        int secondMax = 0;
        int indexOfSecondMax = 0;
        int countFromFirstMaxToSecondMax = 0;
        int min = Integer.MAX_VALUE;
        int indexOfMin = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > firstMax && i != indexOfFirstMax && countFromFirstMaxToSecondMax == 0) {
                firstMax = A[i];
                indexOfFirstMax = i;
            } else if (A[i] < firstMax && A[i] < secondMax) {
                min = Math.min(A[i], min);
                indexOfMin = i;
                countFromFirstMaxToSecondMax++;
            } else if (A[i] > secondMax) {
                secondMax = A[i];
                indexOfSecondMax = i;

            } else if (countFromFirstMaxToSecondMax > 0 && indexOfMin < i && A[i] > min) {
                secondMax = A[i];
                indexOfSecondMax = i;
            }
            if (indexOfFirstMax < indexOfMin && indexOfMin < indexOfSecondMax) {
                result = firstMax > secondMax ? secondMax - min : firstMax - min;
                if (firstMax < secondMax) {
                    firstMax = secondMax;
                    indexOfFirstMax = indexOfSecondMax;
                    secondMax = min;
                    indexOfSecondMax = 0;
                    min = Integer.MAX_VALUE;
                }
            }
        }
        return result;
    }

}
