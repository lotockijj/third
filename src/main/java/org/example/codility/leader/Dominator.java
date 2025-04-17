package org.example.codility.leader;

import java.util.HashMap;
import java.util.Map;

public class Dominator {

    public int solution(int[] A){
        // Implement your solution here
        if(A.length == 0) return -1;
        if(A.length == 1) return 0;
        Map<Integer, Integer> countValues = new HashMap<>();
        int maxValue = 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int key = A[i];
            if(countValues.containsKey(A[i])){
                int value = countValues.get(A[i]);
                value = value + 1;
                countValues.put(A[i], value);
                if(value > maxValue){
                    maxValue = value;
                    result = A[i];
                }
            } else {
                countValues.put(key, 1);
            }
        }
        for (int i = 0; i < A.length; i++) {
            if(A[i] == result){
                result = i;
                break;
            }
        }
        return maxValue > A.length/2 ? result : -1;
    }
}
