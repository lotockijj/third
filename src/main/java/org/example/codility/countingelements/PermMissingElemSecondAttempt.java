package org.example.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElemSecondAttempt {

    public int solution(int[] A){
        Set<Integer> results = new HashSet<>();
        results.add(A.length);
        results.add(A.length + 1);
        int maxValue = 1;
        boolean allNegative = false;
        for (int i = 0; i < A.length; i++) {
            maxValue = Math.max(maxValue, A[i]);
            if(A[i] < 0 && !allNegative) {
                allNegative = true;
            }
            if(!results.add(i)) results.remove(i);
            if(!results.add(A[i])) results.remove(A[i]);
        }
        if(allNegative) return 1;
        return results.stream().filter(e -> e > 1).findFirst().orElse(maxValue);
    }
}
