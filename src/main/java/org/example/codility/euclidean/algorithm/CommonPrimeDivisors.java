package org.example.codility.euclidean.algorithm;

import java.util.HashSet;
import java.util.Set;

public class CommonPrimeDivisors {

    // todo 38% only
    public int solution(int[] A, int[] B){
        // Implement your solution here
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%B[i] == 0 || B[i]%A[i] == 0) {
                Set<Integer> aPrimes = findPrimes(A[i], null);
                Set<Integer> bPrimes = findPrimes(B[i], aPrimes);
                if(aPrimes != null && bPrimes != null &&
                        aPrimes.size() == bPrimes.size() &&
                        aPrimes.containsAll(bPrimes)){
                    result++;
                }
            }
        }
        return result;
    }

    private Set<Integer> findPrimes(int number, final Set<Integer> aPrimes) {
        Set<Integer> primes = new HashSet<>();
        if(aPrimes != null) {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    if (isPrime(i)) {
                        if (aPrimes.contains(i)) {
                            primes.add(i);
                            number = number/i;
                            i--;
                        } else {
                            return new HashSet<>(); // since java9 Set.of();
                        }
                    }
                }
            }
        } else {
            for (int i = 2; i <= number; i++) {
                if (number % i == 0) {
                    if (isPrime(i)) {
                        primes.add(i);
                    }
                }
            }
        }
        return primes.isEmpty() ? null : primes;
    }

    private boolean isPrime(int number) {
        for (int i = 2; 2*i <= number; i++) {
            if(number%i == 0){
                return false;
            }
        }
        return true;
    }
}
