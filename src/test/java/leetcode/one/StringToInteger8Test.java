package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringToInteger8Test {

    private StringToInteger8 sToInt;

    @BeforeEach
    void setUp() {
        sToInt = new StringToInteger8();
    }

    @Test
    void myAtoi1() {
        int actual = sToInt.myAtoi("42");

        assertEquals(42, actual);
    }

    @Test
    void myAtoi2() {
        int actual = sToInt.myAtoi("-42");

        assertEquals(-42, actual);
    }

    @Test
    void myAtoi3() {
        int actual = sToInt.myAtoi("1337c0d3");

        assertEquals(1337, actual);
    }

    @Test
    void myAtoi4() {
        int actual = sToInt.myAtoi("0-1");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi5() {
        int actual = sToInt.myAtoi("words and 987");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi6() {
        int actual = sToInt.myAtoi(" -042");

        assertEquals(-42, actual);
    }

    @Test
    void myAtoi7() {
        int actual = sToInt.myAtoi("3.14159");

        assertEquals(3, actual);
    }

    @Test
    void myAtoi8() {
        int actual = sToInt.myAtoi("-+12");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi9() {
        int actual = sToInt.myAtoi("+1");

        assertEquals(1, actual);
    }

    @Test
    void myAtoi10() {
        int actual = sToInt.myAtoi("+-12");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi11() {
        int actual = sToInt.myAtoi("21474836460");

        assertEquals(2147483647, actual);
    }

    @Test
    void myAtoi12() {
        int actual = sToInt.myAtoi("  0000000000012345678");

        assertEquals(12345678, actual);
    }

    @Test
    void myAtoi13() {
        int actual = sToInt.myAtoi("  20000000000000000000");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi14() {
        int actual = sToInt.myAtoi("   +0 123");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi15() {
        int actual = sToInt.myAtoi("20000000000000000000");

        assertEquals(2147483647, actual);
    }

    @Test
    void myAtoi16() {
        int actual = sToInt.myAtoi("-91283472332");

        assertEquals(-2147483648, actual);
    }

    @Test
    void myAtoi17() {
        int actual = sToInt.myAtoi("  +  413");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi18() {
        int actual = sToInt.myAtoi(" ++1");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi19() {
        int actual = sToInt.myAtoi("21474836++");

        assertEquals(21474836, actual);
    }

    @Test
    void myAtoi20() {
        int actual = sToInt.myAtoi(" -1010023630o4");

        assertEquals(-1010023630, actual);
    }

    @Test
    void myAtoi21() {
        int actual = sToInt.myAtoi("      -11919730356x");

        assertEquals(-2147483648, actual);
    }

    @Test
    void myAtoi22() {
        int actual = sToInt.myAtoi(".1");

        assertEquals(0, actual);
    }

    @Test
    void myAtoi23() {
        int actual = sToInt.myAtoi("000+85");

        assertEquals(0, actual);
    }
}