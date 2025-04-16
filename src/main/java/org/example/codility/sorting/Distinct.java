package org.example.codility.sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public int solution(int[] A){
        Set<Integer> distinctNumbers = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            distinctNumbers.add(A[i]);
        }
        return distinctNumbers.size();
    }
}
