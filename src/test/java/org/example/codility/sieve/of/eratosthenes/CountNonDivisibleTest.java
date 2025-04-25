package org.example.codility.sieve.of.eratosthenes;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountNonDivisibleTest {

    private CountNonDivisible countNonDivisible;

    @BeforeEach
    void setUp() {
        countNonDivisible = new CountNonDivisible();
    }

    @Test
    void solution() {
        int[] A = {3,1,2,3,6};

        int[] solution = countNonDivisible.solution(A);

        assertEquals(2, solution[0]);
        assertEquals(4, solution[1]);
        assertEquals(3, solution[2]);
        assertEquals(2, solution[3]);
        assertEquals(0, solution[4]);
    }
}

/*
You are given an array A consisting of N integers. For each number A[i] such that 0 ≤ i < N,
we want to count the number of elements of the array that are not the divisors of A[i].
We say that these elements are non-divisors.

For example, consider integer N = 5 and array A such that: int[] A = {3,1,2,3,6};
For the following elements:
A[0] = 3, the non-divisors are: 2, 6,
A[1] = 1, the non-divisors are: 3, 2, 3, 6,
A[2] = 2, the non-divisors are: 3, 3, 6,
A[3] = 3, the non-divisors are: 2, 6,
A[4] = 6, there aren't any non-divisors.
Write a function: class Solution { public int[] solution(int[] A); }
that, given an array A consisting of N integers, returns a sequence of integers representing
the amount of non-divisors.
Result array should be returned as an array of integers.
For example, given int[] A = {3,1,2,3,6} :
the function should return [2, 4, 3, 2, 0], as explained above.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..50,000];
each element of array A is an integer within the range [1..2 * N].
 */