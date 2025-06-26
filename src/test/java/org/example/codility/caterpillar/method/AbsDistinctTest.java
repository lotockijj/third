package org.example.codility.caterpillar.method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsDistinctTest {

    private AbsDistinct absDistinct;

    @BeforeEach
    void setUp() {
        absDistinct = new AbsDistinct();
    }

    @Test
    void solution() {
        int[] A = {-5, -3, -1, 0, 3, 6};

        int result = absDistinct.solution(A);

        assertEquals(5, result);
    }
}