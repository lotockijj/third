package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution28Test {

    @Test
    void strStr1() {
        assertEquals(3, Solution28.strStr("awesome", "some"));
    }

    @Test
    void strStr2() {
        assertEquals(3, Solution28.strStr("awesome", "some"));
    }

    @Test
    void strStr3() {
        assertEquals(12, Solution28.strStr("mypackofsiggrets", "rets"));
    }

    @Test
    void strStr4() {
        assertEquals(-1, Solution28.strStr("aaaaa","bba"));
    }

    @Test
    void strStr5() {
        assertEquals(-1, Solution28.strStr("",""));
    }
}