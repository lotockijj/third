package leetcode.one.corrections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    void romanToInt1() {
        assertEquals(3, romanToInteger.romanToInt("III"));
    }

    @Test
    void romanToInt2() {
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
    }

    @Test
    void romanToInt3() {
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}