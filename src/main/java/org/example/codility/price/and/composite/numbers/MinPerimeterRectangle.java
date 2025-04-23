package org.example.codility.price.and.composite.numbers;

import java.util.Stack;

public class MinPerimeterRectangle {

    public int solution(int N){
        if(N < 4) return 2*(N+1);
        Stack<Integer> results = new Stack<>();
        int max = (int)Math.floor(Math.sqrt(N));
        results.push(2*(N+1));
        for (int i = 1; i <= N/max; i++) {
            if(N % i == 0){
                if(i <= N/i){
                    results.push((i + N/i)*2);
                }
            }
        }
        if(N == 4) return 8;
        return results.pop();
    }
}

/*
%30 percent
public int solution(int N){
        double sqrt = Math.sqrt(N);
        int min = (int)Math.floor(sqrt);
        int max = (int)Math.ceil(sqrt);
        int result = 2*(min + max);
        for (int i = 1; i < N; i++) {
            if(min != 0 && min*max == N){
                result = Math.min(result, 2*min + 2*max);
            }
            if(min*max < N){
                max++;
            } else {
                min--;
            }
            if(min >= max) break;
        }
        return result;
    }
 */
