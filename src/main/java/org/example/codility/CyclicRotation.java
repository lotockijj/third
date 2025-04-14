package org.example.codility;

public class CyclicRotation {

    public int[] solution(int[] A, int K){
        int len = A.length;
        if(len == 0){
            return new int[]{};
        }
        int[] result = new int[len];
        K = K > len ? K % len : K;
        for (int i = 0; i < len; i++) { //A = [3, 8, 9, 7, 6]
            int position = i + K;
            if(position < len){
                result[position] = A[i];
            } else {
                result[position - len] = A[i];
            }

        }
        return result;
    }
}
