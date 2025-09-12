package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    private Solution3 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution3();
    }

    @Test
    void lengthOfLongestSubstring1() {
        int actual = solution.lengthOfLongestSubstring("abcabcbb");

        assertEquals(3, actual);
    }

    @Test
    void lengthOfLongestSubstring2() {
        int actual = solution.lengthOfLongestSubstring("bbbbb");

        assertEquals(1, actual);
    }

    @Test
    void lengthOfLongestSubstring3() {
        int actual = solution.lengthOfLongestSubstring("pwwkew");

        assertEquals(3, actual);
    }
}