package org.example.codility.countingelements;

public class MaxCounters {

    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int max = 0;
        int tempMax = 0;
        boolean maxUpdated = false;
        for (int i = 0; i < A.length; i++) { //3, 4, 4, 6, 1, 4, 4 :=> result 3, 2, 2, 4, 2
            if(A[i] < N){
                result[A[i] - 1] = result[A[i] - 1] + 1;
                max = Math.max(result[A[i] - 1], max);
            } else {
                maxCounter(result, max);
            }
            print(result, max);
        }
        //maxCounter(result, max);
        return result;
    }

    private void maxCounter(int[] results, int max) {
        for (int i = 0; i < results.length; i++) {
            if(results[i] < max){
                results[i] = max;
            }
        }
    }

    private void print(int[] result, int max) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.print("     " + max);
        System.out.println();
    }
}
