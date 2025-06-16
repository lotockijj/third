package org.example.warmup;

public class PrimeNumbers {

    public static boolean isPrime(int number){
        boolean result = true;
        for (int i = 2; i < number/2 + 1; i++) {
            if(number % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }
}
