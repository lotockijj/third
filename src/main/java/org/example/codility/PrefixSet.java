package org.example.codility;

import java.util.HashSet;
import java.util.Set;

public class PrefixSet {

    public int solution(int[] A){
        Set<Integer> alreadyUsed = new HashSet<>();
        for (int j : A) {
            alreadyUsed.add(j);
        }
        for (int i = 0; i < A.length; i++) {
            alreadyUsed.remove(A[i]);
            if(alreadyUsed.isEmpty()){
                return i;
            }
        }
        return 0;
    }
}


