package org.example.codility.prefixsums;

public class CountDiv {

    public int solution(int A, int B, int K){
        int result = B - A < K ? 0 : (B - A)/K + 1;
        if(B - A == 0) result = 1;
        return result;
    }
}
