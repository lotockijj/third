package leetcode.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Solution9Test {

    @Test
    void testIsPalindrome_true() {
        Solution9 solution = new Solution9();
        assertTrue(solution.isPalindrome(121));
        assertTrue(solution.isPalindrome(1221));
        assertTrue(solution.isPalindrome(123494321));
        assertFalse(solution.isPalindrome(123));
        assertFalse(solution.isPalindrome(1234943215));
    }
}