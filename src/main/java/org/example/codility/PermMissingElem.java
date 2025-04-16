package org.example.codility;

import java.util.HashSet;
import java.util.Set;

//Appeared the best even though 2 for-each !

public class PermMissingElem {

    public int solution(int[] A){
        // Implement your solution here
        Set<Integer> results = new HashSet<>();
        for (int i = 1; i < A.length + 2; i++) {
            results.add(i);
        }
        for (int i = 0; i < A.length; i++) {
            results.remove(A[i]);
        }
        return results.stream().filter(e -> e > 0).findFirst().orElse(1);
    }
}

/*
public int solution(int[] A){
        // Implement your solution here
        Set<Integer> missing = new HashSet<>();
        missing.add(A.length);
        int maxValue = 1;
        for (int i = 0; i < A.length; i++) {
            int current = A[i];
            maxValue = Math.max(maxValue, current + 1);
            if(!missing.add(i)){
                missing.remove(i);
            }
            if(!missing.add(A[i])){
                missing.remove(A[i]);
            }
        }
        int result = missing.stream().filter(e -> e > 0).findAny().orElse(1);
        if(areEmptyOrNulls(missing)) result = maxValue;
        return result;
    }

    private boolean areEmptyOrNulls(Set<Integer> missing){
        return missing.stream().filter(e -> e != 0).collect(Collectors.toSet()).isEmpty();
    }
 */
