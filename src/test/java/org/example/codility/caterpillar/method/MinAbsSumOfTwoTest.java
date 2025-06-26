package org.example.codility.caterpillar.method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinAbsSumOfTwoTest {

    private MinAbsSumOfTwo minAbsSumOfTwo;

    @BeforeEach
    void setUp() {
        minAbsSumOfTwo = new MinAbsSumOfTwo();
    }

    @Test
    void solution1() {
        int[] A = {1, 4, -3};

        int result = minAbsSumOfTwo.solution(A);

        assertEquals(1, result);
    }

    @Test
    void solution2() {
        int[] A = {-8,4,5,-10,3};

        int result = minAbsSumOfTwo.solution(A);

        assertEquals(3, result);
    }

    @Test
    void solution3() {
        int[] A = {-174, 1, 7, 22, 30, 85, 121, 170, 190};

        int result = minAbsSumOfTwo.solution(A);

        assertEquals(2, result);
    }

    @Test
    void solution4() {
        int[] A = {-174, 7, 22, 30, 85, 121, 170, 190};

        int result = minAbsSumOfTwo.solution(A);

        assertEquals(4, result);
    }

    @Test
    void solution5() {
        int[] A = {7, 22, 30, 85, 121, 170, 190};

        int result = minAbsSumOfTwo.solution(A);

        assertEquals(14, result);
    }
}