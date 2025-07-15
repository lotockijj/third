package org.example.codilitty.data.structure;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrListLenTest {

    private ArrListLen arrListLen;

    @BeforeEach
    void setUp() {
        arrListLen = new ArrListLen();
    }

    @Test
    void solution1() {
        int[] A = {1,4,-1,3,2};

        int result = arrListLen.solution(A);

        assertEquals(4, result);
    }

    @Test
    void solution2() {
        int[] A = {-1,1};

        int result = arrListLen.solution(A);

        assertEquals(1, result);
    }

    @Test
    void solution3() {
        int[] A = {2,-1,1,0,0,0};

        int result = arrListLen.solution(A);

        assertEquals(3, result);
    }
}