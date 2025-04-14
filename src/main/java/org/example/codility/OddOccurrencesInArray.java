package org.example.codility;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

    public int solution(int[] A){
        Set<Integer> numbers = new HashSet<>();
        if(A.length == 0) return 0;
        for (int i = 0; i < A.length; i++) {
            if(!numbers.add(A[i])){
                numbers.remove(A[i]);
            }
        }
        return numbers.stream().findFirst().get();
    }
}
