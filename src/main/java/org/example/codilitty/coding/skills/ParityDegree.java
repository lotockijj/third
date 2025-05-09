package org.example.codilitty.coding.skills;

public class ParityDegree {

    public int solution(int N){
        int result = 0;
        while(N % 2 != 1){
            N = N/2;
            result++;
        }
        return result;
    }
}
