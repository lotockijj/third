package org.example.codilitty.contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloodDepthTest {

    private FloodDepth floodDepth;

    @BeforeEach
    void setUp() {
        floodDepth = new FloodDepth();
    }

    @Test
    void solution1() {
        int[] A = {1,3,2,1,2,1,5,3,3,4,2};

        int result = floodDepth.solution(A);

        assertEquals(2, result);
    }

    @Test
    void solution2() {
        int[] A = {5,8};

        int result = floodDepth.solution(A);

        assertEquals(0, result);
    }

    @Test
    void solution3() {
        int[] A = {1,3,2,1,2,1,5,3,1,4,2};

        int result = floodDepth.solution(A);

        assertEquals(3, result);
    }
}