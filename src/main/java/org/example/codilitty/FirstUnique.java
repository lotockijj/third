package org.example.codilitty;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUnique {

    //todo java.util.ArrayList; only 45% (83%/0% correctness/performance).
    //todo LinkedHashSet; only 90% (83%/100% correctness/performance). {1,2,2,2,1,1} !?
    public int solution(int[] A){
        // Implement your solution here
        Set<Integer> result = new LinkedHashSet<>();
        for (int i = 0; i < A.length; i++) {
            if(result.contains(A[i])){
                result.remove(Integer.valueOf(A[i]));
            } else {
                result.add(A[i]);
            }
        }
        return result.isEmpty() ? -1 : result.stream().findFirst().get();
    }
}
