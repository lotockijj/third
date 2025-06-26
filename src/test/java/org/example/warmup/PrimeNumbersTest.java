package org.example.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @Test
    void isPrime1() {
        assertTrue(PrimeNumbers.isPrime(1));
        assertTrue(PrimeNumbers.isPrime(2));
        assertTrue(PrimeNumbers.isPrime(3));
        assertFalse(PrimeNumbers.isPrime(6));
        assertFalse(PrimeNumbers.isPrime(9));
        assertTrue(PrimeNumbers.isPrime(11));
        assertTrue(PrimeNumbers.isPrime(29));
        assertFalse(PrimeNumbers.isPrime(187)); //11*17
        assertFalse(PrimeNumbers.isPrime(32));
        assertFalse(PrimeNumbers.isPrime(33));
        assertFalse(PrimeNumbers.isPrime(1001));
    }
}