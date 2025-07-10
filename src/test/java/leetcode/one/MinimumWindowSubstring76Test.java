package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstring76Test {

    private MinimumWindowSubstring76 minimumWin;

    @BeforeEach
    void setUp() {
        minimumWin = new MinimumWindowSubstring76();
    }

    @Test
    void minWindow1() {
        String actual = minimumWin.minWindow("ADOBECODEBANC", "ABC");

        assertEquals("BANC", actual);
    }

    @Test
    void minWindow2() {
        String actual = minimumWin.minWindow("a", "a");

        assertEquals("a", actual);
    }

    @Test
    void minWindow3() {
        String actual = minimumWin.minWindow("a", "aa");

        assertEquals("", actual);
    }
}