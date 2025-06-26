package leetcode.one.corrections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {

    private LongestPalindromicSubstring longestPalindrom;

    @BeforeEach
    void setUp() {
        longestPalindrom = new LongestPalindromicSubstring();
    }

    @Test
    void longestPalindrome1() {
        String input = "babad";

        String s = longestPalindrom.longestPalindrome(input);

        assertEquals("bab", s);
    }

    @Test
    void longestPalindrome2() {
        String input = "cbbd";

        String s = longestPalindrom.longestPalindrome(input);

        assertEquals("bb", s);
    }

    @Test
    void longestPalindrome3() {
        String input = "fababamss";

        String s = longestPalindrom.longestPalindrome(input);

        assertEquals("ababa", s);
    }
}