package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {

    private IntegerToRoman integerToRoman;

    @BeforeEach
    void setUp() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    void intToRoman1() {
        assertEquals("MMMDCCXLIX", integerToRoman.intToRoman(3749));
    }

    @Test
    void intToRoman2() {
        assertEquals("LVIII", integerToRoman.intToRoman(58));
    }

    @Test
    void intToRoman3() {
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }
}