package org.example.training;

import java.util.Arrays;

public class May {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int n = 2;
        int[] res = new int[arr.length -1];
        int countRes = 0;
        for (int i = 0; i < arr.length; i++) {
            if(i != n){
                res[countRes++] = arr[i];
            }
        }
        Arrays.stream(res).forEach(System.out::println);
        arr = res;
        Arrays.stream(arr).forEach(System.out::println);
    }
}
