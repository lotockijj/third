package org.example.codility.prefixsums;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDivTest {

    private CountDiv countDiv;

    @BeforeEach
    void setUp() {
        countDiv = new CountDiv();
    }

    @Test
    void solution1() {
        int result = countDiv.solution(6, 11, 2);
        assertEquals(3, result);
    }

    @Test
    void solution2() {
        int result = countDiv.solution(0, 1, 11);
        assertEquals(0, result);
    }

    @Test
    void solution3() {
        int result = countDiv.solution(5, 7, 20);
        assertEquals(0, result);
    }

    @Test
    void solution4() {
        int result = countDiv.solution(10, 10, 20);
        assertEquals(1, result);
    }

    @Test
    void solution5() {
        int result = countDiv.solution(0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        assertEquals(2, result);
    }

    @Test
    void solution6() {
        int result = countDiv.solution(101, 123_450_000, 10_000);
        assertEquals(12345, result);
    }
}
/*
Write a function: class Solution { public int solution(int A, int B, int K); }
that, given three integers A, B and K, returns the number of integers within the range [A..B]
that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }

For example, for A = 6, B = 11 and K = 2, your function should return 3,
because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Write an efficient algorithm for the following assumptions:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
 */