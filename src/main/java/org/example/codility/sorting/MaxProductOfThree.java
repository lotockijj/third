package org.example.codility.sorting;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxProductOfThree {

    //todo 55% achieved due to negative values.
    public int solution(int[] A){
        int firstBiggest = 0;
        int secondBiggest = 0;
        int thirdBiggest = 0;

        int firstMinusSmallest = 0;
        int secondMinusSmallest = 0;

        int firstMinusBiggest = Integer.MIN_VALUE;
        int secondMinusBiggest = Integer.MIN_VALUE;
        int thirdMinusBiggest = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            if(A[i] < 0){
                if(firstMinusSmallest > secondMinusSmallest){
                    firstMinusSmallest = Math.min(A[i], firstMinusSmallest);
                } else {
                    secondMinusSmallest = Math.min(A[i], secondMinusSmallest);
                }
                if(firstMinusBiggest < A[i]){
                    firstMinusBiggest = A[i];
                }
                if(secondMinusBiggest < firstMinusBiggest){
                    int temp = firstMinusBiggest;
                    firstMinusBiggest = secondMinusBiggest;
                    secondMinusBiggest = temp;
                }
                if(thirdMinusBiggest < secondMinusBiggest){
                    int temp = secondMinusBiggest;
                    secondMinusBiggest = thirdMinusBiggest;
                    thirdMinusBiggest = temp;
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
        return findBiggest(firstBiggest, secondBiggest, thirdBiggest, firstMinusSmallest, secondMinusSmallest, firstMinusBiggest, secondMinusBiggest, thirdMinusBiggest);
    }

    private int findBiggest(Integer... arr) {
        int result = 0;
        List<Integer> collect = Arrays.stream(arr)
                .filter(e -> e != 0 && e != Integer.MIN_VALUE)
                .collect(Collectors.toList());
        for (int i = 0; i < collect.size(); i++) {
            for (int j = 0; j < collect.size(); j++) {
                for (int k = 0; k < collect.size(); k++) {
                    if(i != j && i != k && j != k) {
                        result = Math.max(result, collect.get(i) * collect.get(j) * collect.get(k));
                    }
                }
            }
        }
        return result;
    }
}
