package org.example.codility.countingelements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    public int solution(int X, int[] A){
        Set<Integer> fallenLeaves = getAllPositionForLeaves(X);
        for (int i = 0; i < A.length; i++) {
            fallenLeaves.remove(A[i]);
            if(fallenLeaves.isEmpty()){
                return i;
            }
        }
        return -1;
    }

    private Set<Integer> getAllPositionForLeaves(int x) {
        Set<Integer> fallenLeaves = new HashSet<>();
        for (int i = 1; i < x + 1; i++) {
            fallenLeaves.add(i);
        }
        return fallenLeaves;
    }
}
