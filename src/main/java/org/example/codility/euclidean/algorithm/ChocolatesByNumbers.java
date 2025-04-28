package org.example.codility.euclidean.algorithm;

import java.util.HashSet;
import java.util.Set;

public class ChocolatesByNumbers {

    //1,2,3,4,5,6,7,8,9,10,
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
