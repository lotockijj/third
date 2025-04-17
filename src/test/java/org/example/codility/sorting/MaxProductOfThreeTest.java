package org.example.codility.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProductOfThreeTest {

    private MaxProductOfThree maxProductOfThree;

    @BeforeEach
    void setUp() {
        maxProductOfThree = new MaxProductOfThree();
    }

    @Test
    void solution1() {
        int[] A = new int[]{-3, 1, 2, -2, 5, 6};

        int result = maxProductOfThree.solution(A);

        assertEquals(60, result);
    }

    @Test
    void solution2() {
        int[] A = new int[]{-2, -10, -4};

        int result = maxProductOfThree.solution(A);

        assertEquals(80, result);
    }
}

/*
Biggest triplet :
    int[] A = new int[]{-3, 1, 2, -2, 5, 6}
 A[0] = -3
  A[1] = 1
  A[2] = 2
  A[3] = -2
  A[4] = 5
  A[5] = 6
 */