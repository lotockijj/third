package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution65Test {

    private Solution65 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution65();
    }

    @Test
    void isNumber() {
        assertTrue(unit.isNumber("2"));
        assertTrue(unit.isNumber("0089"));
        assertTrue(unit.isNumber("-0.1"));
        assertTrue(unit.isNumber("+3.14"));
        assertTrue(unit.isNumber("4."));
        assertTrue(unit.isNumber("-.9"));
        assertTrue(unit.isNumber("2e10"));
        assertTrue(unit.isNumber("-90E3"));
        assertTrue(unit.isNumber("3e+7"));
        assertTrue(unit.isNumber("+6e-1"));
        assertTrue(unit.isNumber("53.5e93"));
        assertTrue(unit.isNumber("-123.456e789"));
        assertFalse(unit.isNumber("."));
        assertFalse(unit.isNumber("abc"));
        assertFalse(unit.isNumber("1a"));
        assertFalse(unit.isNumber("1e"));
        assertFalse(unit.isNumber("e3"));
        assertFalse(unit.isNumber("99e2.5"));
        assertFalse(unit.isNumber("--6"));
        assertFalse(unit.isNumber("-+3"));
        assertFalse(unit.isNumber("95a54e53"));
        //1440 / 1499 testcases passed
        assertFalse(unit.isNumber("-.E3"));
        //1449 / 1499 testcases passed
        assertFalse(unit.isNumber("6+1"));
        //1472 / 1499 testcases passed
        assertFalse(unit.isNumber(".8+"));
        //1485 / 1499 testcases passed
        assertFalse(unit.isNumber("0+."));
        //1481 / 1499 testcases passed
        assertTrue(unit.isNumber("-1."));
        //1487 / 1499 testcases passed
        assertFalse(unit.isNumber("5-e95"));
        //1491 / 1499 testcases passed
        assertFalse(unit.isNumber("6ee69"));
        //1497 / 1499 testcases passed
        assertFalse(unit.isNumber("092e359-2"));
        //1492 / 1499 testcases passed
        assertFalse(unit.isNumber("Infinity"));
        //1493 / 1499 testcases passed
        assertFalse(unit.isNumber("-Infinity"));
        //1495 / 1499 testcases passed
        assertFalse(unit.isNumber("959440.94f"));
        //1497 / 1499 testcases passed
        assertFalse(unit.isNumber("84656e656D"));
    }

    @Test
    void isNumber2() {
        assertTrue(unit.isNumber2("2"));
        assertTrue(unit.isNumber2("0089"));
        assertTrue(unit.isNumber2("-0.1"));
        assertTrue(unit.isNumber2("+3.14"));
        assertTrue(unit.isNumber2("4."));
        assertTrue(unit.isNumber2("-.9"));
        assertTrue(unit.isNumber2("2e10"));
        assertTrue(unit.isNumber2("-90E3"));
        assertTrue(unit.isNumber2("3e+7"));
        assertTrue(unit.isNumber2("+6e-1"));
        assertTrue(unit.isNumber2("53.5e93"));
        assertTrue(unit.isNumber2("-123.456e789"));
        assertFalse(unit.isNumber2("."));
        assertFalse(unit.isNumber2("abc"));
        assertFalse(unit.isNumber2("1a"));
        assertFalse(unit.isNumber2("1e"));
        assertFalse(unit.isNumber2("e3"));
        assertFalse(unit.isNumber2("99e2.5"));
        assertFalse(unit.isNumber2("--6"));
        assertFalse(unit.isNumber2("-+3"));
        assertFalse(unit.isNumber2("95a54e53"));
        //1440 / 1499 testcases passed
        assertFalse(unit.isNumber2("-.E3"));
        //1449 / 1499 testcases passed
        assertFalse(unit.isNumber2("6+1"));
        //1472 / 1499 testcases passed
        assertFalse(unit.isNumber2(".8+"));
        //1485 / 1499 testcases passed
        assertFalse(unit.isNumber2("0+."));
        //1481 / 1499 testcases passed
        assertTrue(unit.isNumber2("-1."));
        //1487 / 1499 testcases passed
        assertFalse(unit.isNumber2("5-e95"));
        //1491 / 1499 testcases passed
        assertFalse(unit.isNumber2("6ee69"));
        //1497 / 1499 testcases passed
        assertFalse(unit.isNumber2("092e359-2"));
        //1492 / 1499 testcases passed
        assertFalse(unit.isNumber2("Infinity"));
        //1493 / 1499 testcases passed
        assertFalse(unit.isNumber2("-Infinity"));
        //1495 / 1499 testcases passed
        assertFalse(unit.isNumber2("959440.94f"));
        //1497 / 1499 testcases passed
        assertFalse(unit.isNumber2("84656e656D"));
    }
}