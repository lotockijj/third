package org.example.warmup;

import java.util.Arrays;

public class ConsecutiveNumbers {

    public static int solution(int[] arr){
        if(arr.length <= 1) return 0;
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        int expectedLength = max - min + 1;
        return expectedLength - arr.length;
    }
}
