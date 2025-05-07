package org.example.codility.greedy.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxNonoverlappingSegmentsTest {

    private MaxNonoverlappingSegments maxNonoverlappingSegments;

    @BeforeEach
    void setUp() {
        maxNonoverlappingSegments = new MaxNonoverlappingSegments();
    }

    @Test
    void solution1() {
        int[] A = {1,3,7,9,9};
        int[] B = {5,6,8,9,10};

        int result = maxNonoverlappingSegments.solution(A, B);

        assertEquals(3, result);
    }

    @Test
    void solution2() {
        int[] A = {1,5,7,9,9};
        int[] B = {4,6,8,9,10};

        int result = maxNonoverlappingSegments.solution(A, B);

        assertEquals(4, result);
    }

    @Test
    void solution3() {
        int[] A = {};
        int[] B = {};

        int result = maxNonoverlappingSegments.solution(A, B);

        assertEquals(0, result);
    }


}