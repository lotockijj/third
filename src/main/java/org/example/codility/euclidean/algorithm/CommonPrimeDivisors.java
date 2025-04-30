package org.example.codility.euclidean.algorithm;

import java.util.HashSet;
import java.util.Set;

public class CommonPrimeDivisors {
    private static final Set<Integer> primes = new HashSet<>();

    // todo 30% only
    public int solution(int[] A, int[] B) {
        // Implement your solution here
        int result = 0;
        for (int i = 0; i < A.length; i++) { // 15 and 75, 10 and 30, 3 and 5 .
            if(A[i] > B[i]) {
                if(A[i] % B[i] != 0){
                    continue;
                }
                Set<Integer> primes1 = findPrimes(A[i], B[i]);
                if(!primes1.isEmpty()){
                    result++;
                }
            } else if(B[i] > A[i]){
                if(B[i] % A[i] != 0) {
                    continue;
                }
                Set<Integer> primes1 = findPrimes(B[i], A[i]);
                if(! primes1.isEmpty()){
                    result++;
                }
            }
        }
        return result;
    }

    private Set<Integer> findPrimes(int biggerNumber, int smallerNumber) {
        int number = biggerNumber/smallerNumber;
        if(number > smallerNumber && number % smallerNumber != 0) {
            return new HashSet<>();
        }
        while (number > smallerNumber){
            number = number/smallerNumber;
        }
        if(smallerNumber % number != 0) {
            return new HashSet<>();
        }
        Set<Integer> primes = new HashSet<>();
        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                if (primes.contains(i) || isPrime(i)) {
                    primes.add(i);
                    number = number / i;
                    i--;
                } else {
                    return new HashSet<>(); // since java9 Set.of();
                }
            }
        }
        return primes;
    }

    private boolean isPrime(int number) {
        for (int i = 2; 2 * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        if(number != 0) primes.add(number);
        return number != 0;
    }
}

/*
F(M) = F(M - 1) + F(M - 2) if M >= 2
F(7) = F(7-1) + F(7-2) = 6+5 = 11
F(6) = F(6-1) + F(6-2) = 5+4 = 9
F(5) = F(5-1) + F(5-2) = 4+3 = 7
F(4) = F(4-1) + F(4-2) = 3+2 = 5
F(3) = F(3-1) + F(3-2) = 2+1 = 3
F(2) = F(2-1) + F(2-2) = 1+0 = 2
F(1) = 1
F(0) = 0
 */