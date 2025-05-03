package org.example;

import java.util.*;

public class Brain {

    public static void main(String[] args) {
        int[] A = {-3, -10, 2, 7, 9, 100};
        //System.out.println(solve(6, A));
        int[][] arr = {{987654171,3},{987654478,3},{987654092,4},{987654421,3},{987654001,4}};
        Comparator comparator = (c1, c2) -> 0;

        //int[][] arr = {{987654092,4},{987654001,4}};
//987654001 - 987654092
        int result = solution(4, arr);
        //System.out.println(result);
        //System.out.println(solution(31540001));
        int[] seat = {0, 0, 0};
        int[] seat1 = solution(3, 3, seat);
        for (int i = 0; i < seat1.length; i++) {
            //System.out.print(seat1[i] + ", ");
        }
        int total = 1 << 5;
        System.out.println(total);
    }

    static int[] solution(int N, int K, int[] seat){
        boolean[] reserved = new boolean[N+1];
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            int op = seat[i];
            if(op == 0){
                for (int j = 1; j <= N; j++) {
                    if(!reserved[j]){
                        reserved[j] = true;
                        result.add(j);
                        break;
                    }
                }
            } else {
                reserved[op] = false;
            }
        }
        int[] resArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resArray[i] = result.get(i);
        }
        return resArray;
    }

    static int solution(int N, int[][] ratings){
        int result = 0;
        int resultRations = 0;
        for (int i = 0; i < ratings.length; i++) {
            for (int j = 0; j < ratings[i].length; j++) {
                if(ratings[i][1] > resultRations){
                    resultRations = ratings[i][1];
                    result = ratings[i][0];
                } else if(ratings[i][1] == resultRations){
                    if(result > ratings[i][0]){
                        result = ratings[i][0];
                        resultRations = ratings[i][1];
                    }
                }
            }
        }
        return result;
    }

    static int solve(int N, int[] A){
        // Write your code here
        int result = Math.abs(A[0]);
        for (int i = 1; i < A.length; i++) {
            result = Math.min(result, Math.abs(A[i]));
        }
        return result;
    }

    public final  String solution(int timeInSeconds){
        if(timeInSeconds == 0) {
            return "now";
        }
        StringBuffer stringBuffer = new StringBuffer();
        int years = 0;
        if(timeInSeconds > 31540000){
            years = timeInSeconds / 31540000;
        }

        return String.valueOf(years);
    }
}
