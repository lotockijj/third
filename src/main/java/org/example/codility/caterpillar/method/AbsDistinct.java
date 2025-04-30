package org.example.codility.caterpillar.method;

import java.util.HashSet;
import java.util.Set;

public class AbsDistinct {

    public int solution(int[] A){
        Set<Integer> distinctNumbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            distinctNumbers.add(Math.abs(A[i]));
        }
        return distinctNumbers.size();
    }
}
