package leetcode.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Solution34Test {

    @Test
    void findFirstLastPositionOfElement() {
        int[] firstLastPositionOfElement = Solution34.findFirstLastPositionOfElement(new int[]{5, 7, 7, 8, 10}, 8);
        assertEquals(3, firstLastPositionOfElement[0]);
    }

    @Test
    void findFirstLastPositionOfElement2() {
        int[] firstLastPositionOfElement = Solution34.findFirstLastPositionOfElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
        assertEquals(4, firstLastPositionOfElement[0]);
    }

    @Test
    void findFirstLastPositionOfElement3() {
        int[] firstLastPositionOfElement = Solution34.findFirstLastPositionOfElement(new int[]{1, 2, 3, 4, 6, 7, 8, 9, 10}, 5);
        assertEquals(-1, firstLastPositionOfElement[0]);
    }
}