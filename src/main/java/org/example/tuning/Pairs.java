package org.example.tuning;

import java.util.HashSet;
import java.util.Set;

public class Pairs {

    public int getAllPairs(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            int current = arr[i];
            if(!set.add(current)){
                set.remove(current);
                result += 1;
            }
        }
        return result > 0 ? result : -1;
    }
}
