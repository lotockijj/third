package org.example.codility.maximum.slice.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxSliceSumTest {

    private MaxSliceSum maxSliceSum;

    @BeforeEach
    void setUp() {
        maxSliceSum = new MaxSliceSum();
    }

    @Test
    void solution1() {
        int[] A = new int[]{3, 2, -6, 4, 0};

        int result = maxSliceSum.solution(A);

        assertEquals(5, result);
    }

    @Test
    void solution2() {
        int[] A = new int[]{1, 2, 3, 4, 5};

        int result = maxSliceSum.solution(A);

        assertEquals(15, result);
    }

    @Test
    void solution3() {
        int[] A = new int[]{1, 2, 3, -9, 4, 5};

        int result = maxSliceSum.solution(A);

        assertEquals(9, result);
    }

    @Test
    void solution4() {
        int[] A = new int[]{10, -2, 15};

        int result = maxSliceSum.solution(A);

        assertEquals(23, result);
    }

    @Test
    void solution5() {
        int[] A = new int[]{10, -2, -20, 29};

        int result = maxSliceSum.solution(A);

        assertEquals(29, result);
    }
}

/*
A non-empty array A consisting of N integers is given. A pair of integers (P, Q), such that 0 ≤ P ≤ Q < N, is called a slice of array A. The sum of a slice (P, Q) is the total of A[P] + A[P+1] + ... + A[Q].

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the maximum sum of any slice of A.

For example, given array A such that: int[] A = new int[]{3, 2, -6, 4, 0};

A[0] = 3  A[1] = 2  A[2] = -6
A[3] = 4  A[4] = 0
the function should return 5 because:

(3, 4) is a slice of A that has sum 4,
(2, 2) is a slice of A that has sum −6,
(0, 1) is a slice of A that has sum 5,
no other slice of A has sum greater than (0, 1).
 */