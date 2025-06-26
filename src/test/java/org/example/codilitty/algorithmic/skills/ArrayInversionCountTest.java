package org.example.codilitty.algorithmic.skills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayInversionCountTest {

    private ArrayInversionCount arrayInversionCount;

    @BeforeEach
    void setUp() {
        arrayInversionCount = new ArrayInversionCount();
    }

    @Test
    void solution1() {
        int[] A = {-1,6,3,4,7,4};

        int result = arrayInversionCount.solution(A);

        assertEquals(4, result);
    }

    @Test
    void solution2() {
        int[] A = {};

        int result = arrayInversionCount.solution(A);

        assertEquals(0, result);
    }

    @Test
    void solution3() {
        int[] A = {2,1};

        int result = arrayInversionCount.solution(A);

        assertEquals(1, result);
    }
}