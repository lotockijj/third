package org.example.training;

import java.util.Arrays;

public class NeighboursSkip {

    public static int[] removeBiggestNeighbours(int[] arr) {
        int[] result = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) { //1, 3, 6, 7, -5
            if (i == 0 && i + 1 < arr.length && arr[i] > arr[i + 1]) {
                continue;
            } else if (i - 1 >= 0 && i + 1 < arr.length && arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                continue;
            } else if (i == arr.length - 1 && arr[i - 1] < arr[arr.length - 1]) {
                continue;
            }
            result[count++] = arr[i];
        }
        return Arrays.copyOf(result, count);
    }
}
