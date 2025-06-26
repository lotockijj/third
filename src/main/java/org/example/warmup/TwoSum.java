package org.example.warmup;

import java.util.*;

public class TwoSum {

    public List<List<Integer>> getZeroSum(int[] arr){
        Set<List<Integer>> result = new HashSet<>();
        int i = 0;
        int j = arr.length - 1;
        Arrays.sort(arr);
        while(i < j){
            if(arr[i] + arr[j] > 0){
                j--;
            } else if(arr[i] + arr[j] < 0){
                i++;
            } else {
                result.add(List.of(arr[i], arr[j]));
                i++;
                j--;
            }
        }
        return new ArrayList<>(result);
    }
}
