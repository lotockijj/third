package org.example.codility.caterpillar.method;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CountDistinctSlicesTest {

    private CountDistinctSlices countDistinctSlices;

    @BeforeEach
    void setUp() {
        countDistinctSlices = new CountDistinctSlices();
    }

    @Test
    void solution1() {
        int[] A = {3,4,5,5,2};

        int result = countDistinctSlices.solution(6, A);

        assertEquals(9, result);
    }

    @Test
    void solution2() {
        int[] A = {0,1,1};

        int result = countDistinctSlices.solution(6, A);

        assertEquals(4, result);
    }

    @Test
    void solution3() {
        int[] A = {0,1,2,3,4,4,5,5,6,7,8};
                 //5+4+3+2+1+2+1+4+3+2+1
        int result = countDistinctSlices.solution(6, A);

        assertEquals(28, result);
    }

    @Test
    void solution4() {
        int[] A = {0,1,1,0,1,2};
                 //2,1,2,3,2,1 = 2+1+2+3+2+1
        int result = countDistinctSlices.solution(6, A);

        assertEquals(11, result);
    }
}