package org.example.codility.sorting;

public class MaxProductOfThree {

    public int solution(int[] A){
        int firstBiggest = 0;
        int secondBiggest = 0;
        int thirdBiggest = 0;
        int firstMinusBiggest = 0;
        int secondMinusBiggest = 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 0){
                if(firstMinusBiggest > secondMinusBiggest){
                    firstMinusBiggest = Math.min(A[i], firstMinusBiggest);
                } else {
                    secondMinusBiggest = Math.min(A[i], secondMinusBiggest);
                }
            } else {
                if(firstBiggest < A[i]){
                    firstBiggest = A[i];
                }
                if(secondBiggest < firstBiggest){
                    int temp = firstBiggest;
                    firstBiggest = secondBiggest;
                    secondBiggest = temp;
                }
                if(thirdBiggest < secondBiggest){
                    int temp = secondBiggest;
                    secondBiggest = thirdBiggest;
                    thirdBiggest = temp;
                }
            }
        }

        if(firstMinusBiggest < 0 && secondMinusBiggest < 0 && firstMinusBiggest * secondMinusBiggest > thirdBiggest * secondBiggest){
                result = firstMinusBiggest * secondMinusBiggest * thirdBiggest;
        } else {
            result = thirdBiggest * secondBiggest * firstBiggest;
        }
        return result;
    }
}
