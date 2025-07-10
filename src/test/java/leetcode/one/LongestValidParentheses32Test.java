package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

import static leetcode.one.constants.LeetcodeConstants.LONG_PARENTHESES_STRING;
import static org.junit.jupiter.api.Assertions.*;

class LongestValidParentheses32Test {

    private LongestValidParentheses32 validParentheses32;

    @BeforeEach
    void setUp() {
        validParentheses32 = new LongestValidParentheses32();
    }

    @Test
    void longestValidParentheses1() {
        int actual = validParentheses32.longestValidParentheses("(()");

        assertEquals(2, actual);
    }

    @Test
    void longestValidParentheses2() {
        int actual = validParentheses32.longestValidParentheses(")()())");

        assertEquals(4, actual);
    }

    @Test
    void longestValidParentheses3() {
        int actual = validParentheses32.longestValidParentheses("");

        assertEquals(0, actual);
    }

    @Test
    void longestValidParentheses4() {
        int actual = validParentheses32.longestValidParentheses("()");

        assertEquals(2, actual);
    }

    @Test
    void longestValidParentheses5() {
        int actual = validParentheses32.longestValidParentheses("()(()");

        assertEquals(2, actual);
    }

    @Test
    void longestValidParentheses6() {
        int actual = validParentheses32.longestValidParentheses(")()())()()(");

        assertEquals(4, actual);
    }

    @Test
    void longestValidParentheses7() { // ())()(()
        int actual = validParentheses32.longestValidParentheses("(())()(()((");

        assertEquals(6, actual);
    }

    @Test
    void longestValidParentheses8() {
        long start = System.nanoTime();

        int actual = validParentheses32.longestValidParentheses(LONG_PARENTHESES_STRING);
        long actualTimeExecution = TimeUnit.MILLISECONDS.toSeconds((System.nanoTime() - start));
        System.out.println(actualTimeExecution); //2_200_508

        assertEquals(2684, actual);
        assertTrue(actualTimeExecution < 100_000);
    }
}