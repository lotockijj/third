package org.example.lugotest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RealFirstTaskTest {

    private RealFirstTask unit;

    @BeforeEach
    void setUp() {
        unit = new RealFirstTask();
    }

    @Test
    void getMaxSumSubmatrix() {
        int[][] matrix = {
                {1, -2, -1, 4},
                {-8, 3, 4, 2},
                {3, 8, 10, -8},
                {-4, -1, 1, 7}
        };

        int maxSumSubmatrix = unit.getMaxSumSubmatrix(matrix);

        assertEquals(26, maxSumSubmatrix);
    }
}