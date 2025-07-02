package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParentheses20Test {

    private ValidParentheses20 validPar;

    @BeforeEach
    void setUp() {
        validPar = new ValidParentheses20();
    }

    @Test
    void isValid1() {
        assertTrue(validPar.isValid("()"));
    }

    @Test
    void isValid2() {
        assertTrue(validPar.isValid("()[]{}"));
    }

    @Test
    void isValid3() {
        assertFalse(validPar.isValid("(]"));
    }

    @Test
    void isValid4() {
        assertTrue(validPar.isValid("([])"));
    }

    @Test
    void isValid5() {
        assertFalse(validPar.isValid("(){}}{"));
    }

    @Test
    void isValid6() {
        assertFalse(validPar.isValid("(}{)"));
    }
}