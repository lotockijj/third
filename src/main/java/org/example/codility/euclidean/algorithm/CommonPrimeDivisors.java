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
