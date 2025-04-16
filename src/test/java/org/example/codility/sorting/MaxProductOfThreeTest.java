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
    void solution() {
        int[] A = new int[]{-3, 1, 2, -2, 5, 6};

        int result = maxProductOfThree.solution(A);

        assertEquals(60, result);
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