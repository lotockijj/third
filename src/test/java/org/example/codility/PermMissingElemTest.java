package org.example.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermMissingElemTest {

    private PermMissingElem permMissingElem;

    @BeforeEach
    void setUp() {
        permMissingElem = new PermMissingElem();
    }

    @Test
    void solution1() {
        int result = permMissingElem.solution(new int[]{2, 3, 1, 5});

        assertEquals(4, result);
    }

    @Test
    void solution2() {
        int result = permMissingElem.solution(new int[]{1, 3, 6, 4, 1, 2});

        assertEquals(5, result);
    }

    @Test
    void solution3() {
        int result = permMissingElem.solution(new int[]{-1, -3});

        assertEquals(1, result);
    }

    @Test
    void solution4() {
        int result = permMissingElem.solution(new int[]{1, 2, 3});

        assertEquals(4, result);
    }
}

/*
An array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)],
which means that exactly one element is missing.
Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
 */