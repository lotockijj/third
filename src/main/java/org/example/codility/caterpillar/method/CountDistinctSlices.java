package org.example.codility.caterpillar.method;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctSlices {

    // todo 30%
    public int solution(int M, int[] A){
        //0,1,2,3,4,4,5,5,6,7,8
        //5+4+3+2+1+2+1+4+3+2+1

        //3,4,5,5,2
        //3,2,1,2,1

        //0,1,1,0,1,2
        //2,1,2,3,2,1 = 2+1+2+3+2+1
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            Set<Integer> distinct = new HashSet<>();
            for (int j = i; j < A.length; j++) {
                if(distinct.add(A[j])){
                    result++;
                } else {
                    result += distinct.size() < 2 ? 1 : factorial(distinct.size());
                    i = --j;
                    break;
                }
            }
            if(result == 1_000_000_000) break;
        }
        return result;
    }

    private int factorial(int number) {
        int result = 1;
        for (int i = 2; i < number; i++) {
            result += i;
        }
        return result;
    }
}

/*
public int solution(int M, int[] A){
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            Set<Integer> distinct = new HashSet<>();
            for (int j = i; j < A.length; j++) {
                if(distinct.add(A[j])){
                    result++;
                    //if(result == 1_000_000_000) break;
                } else {
                    result += distinct.size() == 2 ? 1 : distinct.size();
                    i = --j;
                    break;
                }
            }
        }
        return result;
    }
 */

/*
    public int solution(int M, int[] A){
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            Set<Integer> distinct = new HashSet<>();
            for (int j = i; j < A.length; j++) {
                if(distinct.add(A[j])){
                    result++;
                    //if(result == 1_000_000_000) break;
                } else {
                    break;
                }
            }
        }
        return result;
    }
 */

/* 70%
public int solution(int M, int[] A){
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            Set<Integer> distinct = new HashSet<>();
            for (int j = i; j < A.length; j++) {
                if(distinct.add(A[j])){
                    result++;
                } else {
                    result += distinct.size() < 2 ? 1 : factorial(distinct.size());
                    i = --j;
                    break;
                }
            }
            if(result == 1_000_000_000) break;
        }
        return result;
    }

    private int factorial(int number) {
        int result = 1;
        for (int i = 2; i < number; i++) {
            result += i;
        }
        return result;
    }
 */