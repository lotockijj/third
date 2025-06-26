package org.example.codilitty.data.structure;

import java.util.HashSet;
import java.util.Set;

public class ArrListLen {

    //todo 50%
    public int solution(int[] A){
        //1,4,-1,3,2
        Set<Integer> result = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(A[i] == -1){
                continue;
            }
            result.add(A[i]);
        }
        return result.size();
    }
}
