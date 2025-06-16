package org.example.warmup;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LargestFour {

    public static int solution(int[] arr){
        int f = Integer.MIN_VALUE;
        int s = Integer.MIN_VALUE;
        int t = Integer.MIN_VALUE;
        int l = Integer.MIN_VALUE;
        Arrays.sort(arr);
        return getSumOfLastFour(arr);
    }

    private static int getSumOfLastFour(int[] arr) {
        int result;
        if(arr.length < 4){
            result = Arrays.stream(arr).boxed().reduce(0, Integer::sum);
        } else {
            int len = arr.length - 1;
            result = arr[len--] + arr[len--] + arr[len--] + arr[len--];
        }
        return result;
    }
}
