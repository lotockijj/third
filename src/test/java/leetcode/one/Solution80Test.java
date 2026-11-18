package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution80Test {

    private Solution80 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution80();
    }

    @Test
    void removeDuplicates1() {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int actual = unit.removeDuplicates(nums);

        assertEquals(5, actual);
        assertArrayEquals(new int[]{1, 1, 2, 2, 3, 3}, nums);
    }

    @Test
    void removeDuplicates2() {
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};

        int actual = unit.removeDuplicates(nums);

        assertEquals(7, actual);
        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 3, 3, 3, 3}, nums);
    }
}