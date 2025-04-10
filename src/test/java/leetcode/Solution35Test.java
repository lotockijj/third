package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution35Test {

    @Test
    void searchInsertPosition() {
        int insertPosition = Solution35.searchInsertPosition(new int[]{1, 3, 5, 6}, 5);
        assertEquals(2, insertPosition);
    }

    @Test
    void searchInsertPosition2() {
        int insertPosition = Solution35.searchInsertPosition(new int[]{1, 3, 5, 6}, 2);
        assertEquals(1, insertPosition);
    }

    @Test
    void searchInsertPosition3() {
        int insertPosition = Solution35.searchInsertPosition(new int[]{1, 3, 5, 6}, 7);
        assertEquals(4, insertPosition);
    }

    @Test
    void searchInsertPosition4() {
        int insertPosition = Solution35.searchInsertPosition(new int[]{1}, 0);
        assertEquals(0, insertPosition);
    }
}