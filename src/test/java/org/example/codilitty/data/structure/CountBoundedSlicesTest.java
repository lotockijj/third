package org.example.codilitty.data.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountBoundedSlicesTest {

    private CountBoundedSlices countBoundedSlices;

    @BeforeEach
    void setUp() {
        countBoundedSlices = new CountBoundedSlices();
    }

    @Test
    void solution() {
        int[] A = {3,5,7,6,3};

        int result = countBoundedSlices.solution(2, A);

        assertEquals(9, result);
    }
}