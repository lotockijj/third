package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution81Test {

    public Solution81 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution81();
    }

    @Test
    void search1() {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};

        assertTrue(unit.search(arr, 0));
        assertFalse(unit.search(arr, 3));
    }

    @Test
    void search2() {
        int[] arr = {1};

        assertTrue(unit.search(arr, 1));
    }

    @Test
    void search3() {
        int[] arr = {2, 2, 2, 3, 2, 2, 2};

        assertTrue(unit.search(arr, 3));
    }

    @Test
    void search4() {
        int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};

        assertTrue(unit.search(arr, 2));
    }

    //276 / 286 testcases passed
    @Test
    void search5() {
        int[] arr = {3, 1};

        assertTrue(unit.search(arr, 3));
    }

    @Test
    void findPivot() {
        int[] arr = {2, 5, 6, 0, 0, 1, 2};
        int[] arr2 = {2, 5, 6, 7, 9, 0, 0, 1, 2};
        int[] arr3 = {0, 1, 2, 3, 4, 5, 6};

        assertEquals(3, unit.findPivot(arr));
        assertEquals(5, unit.findPivot(arr2));
        assertEquals(0, unit.findPivot(arr3));
    }
}