package org.example.codility.caterpillar.method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountTrianglesTest {

    private CountTriangles countTriangles;

    @BeforeEach
    void setUp() {
        countTriangles = new CountTriangles();
    }

    @Test
    void solution1() {
        int[] A = {2,5,4};

        int result = countTriangles.solution(A);

        assertEquals(1, result);
    }

    @Test
    void solution2() {
        int[] A = {10, 2, 5, 1, 8, 12};

        int result = countTriangles.solution(A);

        assertEquals(4, result);
    }

    @Test
    void solution3() {
        int[] A = {10, 2, 5, 1, 8, 12, 21};

        int result = countTriangles.solution(A);

        assertEquals(5, result);
        /*
        isBreak
        isBreak
        (5 8 10)
        (5 8 12)
        (5 10 12)
        (8 10 12)
vs
        isBreak
        isBreak
        (5 8 10)
        (5 8 12)
        isBreak
        (8 10 12)
        isBreak
        (10 12 21)
         */
    }
}