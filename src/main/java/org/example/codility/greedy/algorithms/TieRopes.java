package org.example.codility.greedy.algorithms;

public class TieRopes {

    public int solution(int K, int[] A){ //1,2,3,4,1,1,3
        int temp = 0;
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            temp += A[i];
            if(temp >= K || A[i] >= K){
                result++;
                temp = 0;
            }
        }
        return result;
    }
}
