package org.example.codility.price.and.composite.numbers;

public class CountFactors {

    //todo 71% TIMEOUT ERROR, performance only 33%
    public int solution(int N){
        // Implement your solution here
        int result = 1;
        for (int i = 1; i <= N/2; i++) {
            if(N % i == 0){
                result++;
            }
        }
        return result;
    }
}
