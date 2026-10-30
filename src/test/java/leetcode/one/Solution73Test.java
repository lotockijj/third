package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution73Test {

    private Solution73 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution73();
    }

    @Test
    void setZeroes1() {
        int[][] arr = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};

        unit.setZeroes(arr);

        assertEquals(0, arr[0][1]);
        assertEquals(0, arr[1][0]);
        assertEquals(0, arr[1][2]);
        assertEquals(0, arr[2][1]);
    }

    @Test
    void setZeroes2() {
        int[][] arr = {
                {0, 1, 2, 0},
                {3, 4, 5, 2},
                {1, 3, 1, 5}};

        unit.setZeroes(arr);

        assertEquals(0, arr[0][1]);
        assertEquals(0, arr[0][2]);
        assertEquals(0, arr[0][3]);
        assertEquals(0, arr[1][3]);
        assertEquals(0, arr[2][3]);
    }
}