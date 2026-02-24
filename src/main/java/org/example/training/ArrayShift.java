package org.example.training;

public class ArrayShift {

    public static int[] shiftArray(int[] arr, int shift){
        int[] swapped = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(count + shift > arr.length - 1){
                count = -shift;
            }
            swapped[count + shift] = arr[i];
            count++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = swapped[i];
        }
        return swapped;
    }
}
