package org.example.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {

    public int solution(int[] A){
        Set<Integer> allNumbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(!allNumbers.add(i + 1)){
                allNumbers.remove(i + 1);
            }
            if(!allNumbers.add(A[i])){
                allNumbers.remove(A[i]);
            }
        }
        return allNumbers.isEmpty() ? 1 : 0;
    }
}
