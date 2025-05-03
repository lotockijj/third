package org.example.codility;

import java.util.HashSet;
import java.util.Set;

public class MinimalPositiveNumber {

    public int solution(int[] A){
        Set<Integer> allNumbers = new HashSet<>();
        boolean allNegative = false;
        int maxValue = 0;
        for (int i = 1; i < A.length + 1; i++) {
            allNumbers.add(i);
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] < 0) {
                allNegative = true;
                break;
            }
            allNumbers.remove(A[i]);
            maxValue = Math.max(A[i] + 1, maxValue);
        }
        if(allNegative) return 1;

        return allNumbers.isEmpty() ? maxValue : allNumbers.stream().findFirst().get();
    }
}
