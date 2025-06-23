package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularExpressionMatchingTest {

    private RegularExpressionMatching expressionMatching;

    @BeforeEach
    void setUp() {
        expressionMatching = new RegularExpressionMatching();
    }

    @Test
    void isMatch1() {
        assertFalse(expressionMatching.isMatch("aa", "a"));
    }

    @Test
    void isMatch2() {
        assertTrue(expressionMatching.isMatch("aa", "a*"));
    }

    @Test
    void isMatch3() {
        assertTrue(expressionMatching.isMatch("ab", ".*"));
    }
}