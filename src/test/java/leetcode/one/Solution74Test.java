package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution74Test {

    private Solution74 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution74();
    }

    @Test
    void searchMatrix1() {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        assertTrue(unit.searchMatrix(arr, 3));
    }

    @Test
    void searchMatrix2() {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        assertFalse(unit.searchMatrix(arr, 13));
    }

    @Test
    void searchMatrix3() {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};

        assertTrue(unit.searchMatrix(arr, 23));
    }

    @Test
    void searchMatrix4() {
        int[][] arr = {{1, 3}};

        assertFalse(unit.searchMatrix(arr, 2));
    }
}