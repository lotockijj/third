package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSay38Test {

    private CountAndSay38 countAndSay;

    @BeforeEach
    void setUp() {
        countAndSay = new CountAndSay38();
    }

    @Test
    void getCount() {
        int count = countAndSay.getCount("2233144444117");

        assertEquals(6, count);
    }

    @Test
    void mapIntegersToPairs() {
        int[][] ints = countAndSay.mapIntegersToPairs("223314444411");

        assertEquals(2, ints[0][0]);
        assertEquals(2, ints[0][1]);
        assertEquals(1, ints[2][1]);
        assertEquals(1, ints[2][1]);
    }

    @Test
    void integersToStringOfPairs() {
        String actual = countAndSay.integersToStringOfPairs(
                countAndSay.mapIntegersToPairs("223314444411"));

        assertEquals("2223115421", actual);
    }

    @Test
    void countAndSay1() {
        String actual = countAndSay.countAndSay(1);

        assertEquals("1", actual);
    }

    @Test
    void countAndSay2() {
        String actual = countAndSay.countAndSay(2);

        assertEquals("11", actual);
    }

    @Test
    void countAndSay3() {
        String actual = countAndSay.countAndSay(3);

        assertEquals("21", actual);
    }

    @Test
    void countAndSay4() {
        String actual = countAndSay.countAndSay(4);

        assertEquals("1211", actual);
    }

    @Test
    void countAndSay5() {
        String actual = countAndSay.countAndSay(5);

        assertEquals("111221", actual);
    }

    @Test
    void countAndSay6() {
        String actual = countAndSay.countAndSay(6);

        assertEquals("312211", actual);
    }
}