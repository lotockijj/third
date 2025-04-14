package org.example.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CyclicRotationTest {

    private CyclicRotation cyclicRotation;

    @BeforeEach
    void setUp() {
        cyclicRotation = new CyclicRotation();
    }

    @Test
    void solution1() {
        int[] arr = new int[]{3, 8, 9, 7, 6};
        int[] solution = cyclicRotation.solution(arr, 3);
        assertEquals(9, solution[0]);
        assertEquals(7, solution[1]);
        assertEquals(6, solution[2]);
        assertEquals(3, solution[3]);
        assertEquals(8, solution[4]);
    }

    @Test
    void solution2() {
        int[] arr = new int[]{0, 0, 0};
        int[] solution = cyclicRotation.solution(arr, 1);
        assertEquals(0, solution[0]);
        assertEquals(0, solution[1]);
        assertEquals(0, solution[2]);
    }

    @Test
    void solution3() {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] solution = cyclicRotation.solution(arr, 4);
        assertEquals(1, solution[0]);
        assertEquals(2, solution[1]);
        assertEquals(3, solution[2]);
        assertEquals(4, solution[3]);
    }

    @Test
    void solution4() {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] solution = cyclicRotation.solution(arr, 8);
        assertEquals(1, solution[0]);
        assertEquals(2, solution[1]);
        assertEquals(3, solution[2]);
        assertEquals(4, solution[3]);
    }

    @Test
    void solution5() {
        int[] arr = new int[]{};
        int[] solution = cyclicRotation.solution(arr, 8);

        assertEquals(0, solution.length);
    }

}

/*
An array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index,
and the last element of the array is moved to the first place. For example,
the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]
(elements are shifted right by one index and 6 is moved to the first place).
The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:
class Solution { public int[] solution(int[] A, int K); }
that, given an array A consisting of N integers and an integer K, returns the array A rotated K times.
For example, given
    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:
    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given
    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]
Given
    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]
Assume that:
N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 */