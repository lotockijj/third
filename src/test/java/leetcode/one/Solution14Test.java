package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution14Test {

    private Solution14 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution14();
    }

    @Test
    void testLongestCommonPrefix() {
        String[] strs = new String[]{"flower","flow","flight"};

        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);

        assertEquals("fl", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix2() {
        String[] strs = new String[]{"dog","racecar","car"};

        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);

        assertEquals("", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix3() {
        String[] strs = new String[]{"dog","racecar","car", ""};

        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);

        assertEquals("", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix4() {
        String[] strs = new String[]{"anyone","anyone2","anyone3", "anyone4"};

        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);

        assertEquals("anyone", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix5() {
        String[] strs = new String[]{"a"};

        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);

        assertEquals("a", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix6() {
        String[] strs = new String[]{"cir","car"};

        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);

        assertEquals("c", longestCommonPrefix);
    }
}