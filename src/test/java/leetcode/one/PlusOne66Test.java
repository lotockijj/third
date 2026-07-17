package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOne66Test {

    private PlusOne66 solution;

    @BeforeEach
    void setUp() {
        solution = new PlusOne66();
    }

    @Test
    void plusOne1() {
        int[] arr = {1, 2, 3};

        int[] result = solution.plusOne(arr);

        assertEquals(4, result[2]);
        assertEquals(3, result.length);
    }

    @Test
    void plusOne2() {
        int[] arr = {4, 3, 2, 1};

        int[] result = solution.plusOne(arr);

        assertEquals(2, result[3]);
        assertEquals(4, result.length);
    }

    @Test
        //97 / 114 testcases passed
    void plusOne3() {
        int[] arr = {9};

        int[] result = solution.plusOne(arr);

        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
        assertEquals(2, result.length);
    }

    @Test
//93 / 114 testcases passed
    void plusOne4() {
        int[] arr = {8, 9, 9, 9};

        int[] result = solution.plusOne(arr);

        assertEquals(9, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
        assertEquals(0, result[3]);
        assertEquals(4, result.length);
    }

    @Test
    void plusOne5() {
        int[] arr = {9, 9};

        int[] result = solution.plusOne(arr);

        assertEquals(1, result[0]);
        assertEquals(0, result[1]);
        assertEquals(0, result[2]);
        assertEquals(3, result.length);
    }
}