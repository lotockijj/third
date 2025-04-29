package org.example.codility.euclidean.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonPrimeDivisorsTest {

    private CommonPrimeDivisors commonPrimeDivisors;

    @BeforeEach
    void setUp() {
        commonPrimeDivisors = new CommonPrimeDivisors();
    }

    @Test
    void solution1() {
        int[] A = {15, 10, 3};
        int[] B = {75, 30, 5};

        int result = commonPrimeDivisors.solution(A, B);

        assertEquals(1, result);
    }

    @Test
    void solution2() {
        int[] A = {4, 39, 637, 3};
        int[] B = {16, 78, 91, 9};

        int result = commonPrimeDivisors.solution(A, B);

        assertEquals(3, result);
    }

    @Test
    void solution3() {
        int[] A = {3, 7, 2197};
        int[] B = {9, 49, 13};

        int result = commonPrimeDivisors.solution(A, B);

        assertEquals(3, result);
    }
}

/*
A prime is a positive integer X that has exactly two distinct divisors: 1 and X.
The first few prime integers are 2, 3, 5, 7, 11 and 13.
A prime D is called a prime divisor of a positive integer P if there exists a positive integer K
such that D * K = P. For example, 2 and 5 are prime divisors of 20.

You are given two positive integers N and M. The goal is to check whether the sets
of prime divisors of integers N and M are exactly the same.

For example, given:
N = 15 and M = 75, the prime divisors are the same: {3, 5};
N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
Write a function: class Solution { public int solution(int[] A, int[] B); }
that, given two non-empty arrays A and B of Z integers, returns the number of positions K
for which the prime divisors of A[K] and B[K] are exactly the same.

For example, given: int[] A = {15, 10, 3} and int[] B = {75, 30, 5}
the function should return 1, because only one pair (15, 75) has the same set of prime divisors.
Write an efficient algorithm for the following assumptions:
Z is an integer within the range [1..6,000];
each element of arrays A and B is an integer within the range [1..2,147,483,647].
 */