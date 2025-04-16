package org.example.codility.sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistinctTest {

    private Distinct distinct;

    @BeforeEach
    void setUp() {
        distinct = new Distinct();
    }

    @Test
    void solution() {
        int result = distinct.solution(new int[]{2, 2, 1, 3, 1, 1});

        assertEquals(3, result);
    }
}