package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepeatedSubstringPattern_459Test {

    private RepeatedSubstringPattern_459 pattern_459;
    @BeforeEach
    void setUp() {
        pattern_459 = new RepeatedSubstringPattern_459();
    }

    @Test
    void repeatedSubstringPattern1() {
        assertTrue(pattern_459.repeatedSubstringPattern("abab"));
    }

    @Test
    void repeatedSubstringPattern2() {
        assertFalse(pattern_459.repeatedSubstringPattern("aba"));
    }

    @Test
    void repeatedSubstringPattern3() {
        assertTrue(pattern_459.repeatedSubstringPattern("abcabcabcabc"));
    }

    @Test
    void repeatedSubstringPattern4() {
        assertFalse(pattern_459.repeatedSubstringPattern("aabaaba"));
    }

    @Test
    void repeatedSubstringPattern6() {
        assertFalse(pattern_459.repeatedSubstringPattern("aabaabaaabaabaaabaabas"));
    }
}