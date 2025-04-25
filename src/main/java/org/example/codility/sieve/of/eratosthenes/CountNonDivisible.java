package org.example.codility.sieve.of.eratosthenes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountNonDivisible {

    //todo still only 66% as bellow
    public int[] solution(int[] A) { //int[] A = {3,1,2,3,6}  [2, 4, 3, 2, 0] 1,2,3,3,6
        int[] result = new int[A.length];
        int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(copy);
        Map<Integer, Integer> alreadyProcessed = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            if (alreadyProcessed.containsKey(A[i])) {
                result[i] = alreadyProcessed.get(A[i]);
            } else {
                for (int j = 0; j < A.length; j++) {
                    if (A[i] < copy[j]) {
                        count = count + A.length - j;
                        break;
                    } else if (A[i] % copy[j] != 0) {
                        count++;
                    }
                }
                result[i] = count;
                alreadyProcessed.put(A[i], count);
            }
        }
        return result;
    }
}

/* 66%
public int[] solution(int[] A) { //int[] A = {3,1,2,3,6}  [2, 4, 3, 2, 0] 1,2,3,3,6
        int[] result = new int[A.length];
        Map<Integer, Integer> alreadyProcessed = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            if (alreadyProcessed.containsKey(A[i])) {
                result[i] = alreadyProcessed.get(A[i]);
                //System.out.println("Skipped calculation for i and A[i]: " + i + " " + A[i]);
            } else {
                for (int j = 0; j < A.length; j++) {
                    if (i != j && A[i] % A[j] != 0) {
                        count++;
                    }
                }
                result[i] = count;
                alreadyProcessed.put(A[i], count);
            }
        }
        return result;
    }
 */

/* 55%
public int[] solution(int[] A) { //int[] A = {3,1,2,3,6}  [2, 4, 3, 2, 0] 1,2,3,3,6
        int[] result = new int[A.length];
        int[] copy = Arrays.copyOf(A, A.length);
        Arrays.sort(copy);
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 0; j < A.length; j++) {
                if(A[i] < copy[j]) {
                    count = count + A.length - j;  break;
        }
        if (A[i] % copy[j] != 0) {
//System.out.println("Check for i - j - A[i] - copy[j] : " + i + " " + j +" " + A[i] + " " + copy[j]);
count++;
        }
        }
//System.out.println();
result[i] = count;
        }
                return result;
    }
 */