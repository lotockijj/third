package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution75Test {

    private Solution75 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution75();
    }

    @Test
    void sortColors1() {
        int[] arr = {2, 0, 2, 1, 1, 0};

        unit.sortColors(arr);

        assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, arr);
    }

    @Test
    void sortColors2() {
        int[] arr = {2, 0, 1};

        unit.sortColors(arr);

        assertArrayEquals(new int[]{0, 1, 2}, arr);
    }
}