package org.example.codility.euclidean.algorithm;

import java.util.HashSet;
import java.util.Set;

public class ChocolatesByNumbers {

    // todo 37 %
    public int solution(int N, int M) {
        // Implement your solution here
        int result = 0;
        int remainder0fDivision = N % M;
        if(remainder0fDivision == 0){
            return N/M;
        } else {
            int partResult = M > N ? partSolution(N, M) : partSolution(remainder0fDivision + M, M);
            result = N/M > 1 ? N/M + partResult : partResult;
        }
        return result;
    }

    private int partSolution(int N, int M) {
        Set<Integer> alreadyEaten = new HashSet<>();
        int current = 0;
        for (int i = 1; i <= N; i++) {
            current++;
            if(current == M){
                if(alreadyEaten.contains(i)) break;
                alreadyEaten.add(i);
                current = 0;
            }
            if(i == N){
                i = 0;
            }
        }
        return alreadyEaten.size();
    }
}

/*  0% :)
public int solution(int N, int M) {
        Set<Integer> alreadyEaten = new HashSet<>();
        int current = 0;
        for (int i = 1; i <= N; i++) {
            current++;
            if(current == M){
                if(alreadyEaten.contains(i)) break;
                alreadyEaten.add(i);
                current = 0;
            }
            if(i == N){
                i = 0;
            }
        }
        return N - alreadyEaten.size();
    }
 */
