package org.example.codility;

import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {

    public int solution(int[] A){
        Set<Integer> results = new HashSet<>();
        results.add(A.length);
        results.add(A.length + 1);
        for (int i = 0; i < A.length; i++) {
            if(!results.add(i)) results.remove(i);
            if(!results.add(A[i])) results.remove(A[i]);
        }
        return results.stream().filter(e -> e != 0).findFirst().orElse(-1);
    }
}
