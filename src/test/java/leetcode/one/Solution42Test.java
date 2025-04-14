package leetcode.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class Solution42Test {

    @Test
    void getValueOfWater() {
        assertEquals(6, Solution42.getValueOfWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}