package leetcode.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution14Test {

    @Test
    void testLongestCommonPrefix() {
        Solution14 solution = new Solution14();
        String[] strs = new String[]{"flower","flow","flight"};
        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);
        assertEquals("fl", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix2() {
        Solution14 solution = new Solution14();
        String[] strs = new String[]{"dog","racecar","car"};
        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);
        assertEquals("", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix3() {
        Solution14 solution = new Solution14();
        String[] strs = new String[]{"dog","racecar","car", ""};
        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);
        assertEquals("", longestCommonPrefix);
    }

    @Test
    void testLongestCommonPrefix4() {
        Solution14 solution = new Solution14();
        String[] strs = new String[]{"anyone","anyone2","anyone3", "anyone4"};
        String longestCommonPrefix = solution.getLongestCommonPrefix(strs);
        assertEquals("anyone", longestCommonPrefix);
    }
}