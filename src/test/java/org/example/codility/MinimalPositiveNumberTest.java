package org.example.codility;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimalPositiveNumberTest {

    private MinimalPositiveNumber minimalPositiveNumber;

    @BeforeEach
    void setUp() {
        minimalPositiveNumber = new MinimalPositiveNumber();
    }

    @Test
    void solution1() {
        int[] A = {1,3,6,4,1,2};

        int result = minimalPositiveNumber.solution(A);

        assertEquals(5, result);

    }

    @Test
    void solution2() {
        int[] A = {1,2,3};

        int result = minimalPositiveNumber.solution(A);

        assertEquals(4, result);

    }
}