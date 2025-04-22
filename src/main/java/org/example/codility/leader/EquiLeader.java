package org.example.codility.leader;

public class EquiLeader {

    public int solution(int[] A){
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                int sum = 0;
                for (int k = i; k < j + 1; k++) {
                    sum += A[i];
                    System.out.print(sum + ", ");
                }
                result = Math.max(result, sum);
                System.out.println(" :=> " + result);
            }
        }
        return result;
    }
}
