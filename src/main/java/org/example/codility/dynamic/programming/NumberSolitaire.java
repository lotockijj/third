package org.example.codility.dynamic.programming;

public class NumberSolitaire {

    //todo 12% (only 20% correctness !)
    public int solution(int[] A){
        // Implement your solution here
        //1,-2, 0, 9, -1, -2
        //1,-2, 0, -1, -1, -2, -5, -100, -1, 9, 1
        int result = A[0] + A[A.length - 1];
        int temp = 0;
        int diceMax = 6;
        int diceTemp = 0;
        for (int i = 1; i < A.length - 1; i++) {
            if(temp + A[i] > temp) {
                result += A[i];
            } else if(diceTemp == 6){
                temp += findSmallest(i, A);
                diceTemp = 0;
            }
            diceTemp++;
            if(diceTemp > diceMax){
                diceTemp = 0;
            }

        }
        return result;
    }

    private int findSmallest(int i, int[] a) {
        int max = a[i];
        for (int j = i - 1; j >= 0 && j > i - 5; j--) {
            max = Math.max(max, a[j]);
        }
        return max;
    }
}
