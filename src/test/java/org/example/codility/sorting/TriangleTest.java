package org.example.codility.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    private Triangle triangle;

    @BeforeEach
    void setUp() {
        triangle = new Triangle();
    }

    @Test
    void solution1() {
        int[] A = new int[]{10, 2, 5, 1, 8, 20}; //1,2,5,8,10,20

        int result = triangle.solution(A);

        assertEquals(1, result);
    }

    @Test
    void solution2() {
        int[] A = new int[]{10, 50, 5, 1};

        int result = triangle.solution(A);

        assertEquals(0, result);
    }

    @Test
    void twoElementsShouldReturnZero() {
        int[] A = new int[]{10, 50};

        int result = triangle.solution(A);

        assertEquals(0, result);
    }
}
/*
An array A consisting of N integers is given. A triplet (P, Q, R) is triangular if 0 ≤ P < Q < R < N and:
A[P] + A[Q] > A[R],
A[Q] + A[R] > A[P],
A[R] + A[P] > A[Q].
For example, consider array A such that: new int[]{10, 2, 5, 1, 8, 20};

  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
Triplet (0, 2, 4) is triangular.

Write a function: class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns 1 if there exists a triangular triplet for this array and returns 0 otherwise.

For example, given array A such that:
  A[0] = 10    A[1] = 2    A[2] = 5
  A[3] = 1     A[4] = 8    A[5] = 20
the function should return 1, as explained above. Given array A such that:
  A[0] = 10    A[1] = 50    A[2] = 5    A[3] = 1
the function should return 0.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */