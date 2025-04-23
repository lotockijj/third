package org.example.codility.maximum.slice.problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {

    private MaxProfit maxProfit;

    @BeforeEach
    void setUp() {
        maxProfit = new MaxProfit();
    }

    @Test
    void solution1() {
        int[] A = new int[]{23171, 21011, 21123, 21366, 21013, 21367};

        int result = maxProfit.solution(A);

        assertEquals(356, result);
    }

    @Test
    void solution2() {
        int[] A = new int[]{8, 6, 3, 2, 3, 1};

        int result = maxProfit.solution(A);

        assertEquals(1, result);
    }

    @Test
    void solution3() {
        int[] A = new int[]{0, 200000};

        int result = maxProfit.solution(A);

        assertEquals(200000, result);
    }

    @Test
    void solution4() {
        int[] A = new int[]{8, 9, 3, 6, 1, 2};

        int result = maxProfit.solution(A);

        assertEquals(3, result);
    }

    /*
    two_hills
    two increasing subsequences✘WRONG ANSWER
    got 3000 expected 99000
     */

    @Test
    void solution5() {
        int[] A = new int[]{1,3,7,10,7,3,1,2,5,2,1};

        int result = maxProfit.solution(A);

        assertEquals(9, result);
    }
}