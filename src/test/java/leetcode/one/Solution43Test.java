package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution43Test {

    private Solution43 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution43();
    }

    @Test
    void multiply1() {
        String multiply = solution.multiply("2", "3");

        assertEquals("6", multiply);
    }

    @Test
    void multiply2() {
        String multiply = solution.multiply("123", "456");

        assertEquals("56088", multiply);
    }

    @Test
    void multiply3() { // 142 from 311
        String multiply = solution.multiply("9", "99");

        assertEquals("891", multiply);
    }

    @Test
    void multiply4() { //151 from 311
        String multiply = solution.multiply("9133", "0");

        assertEquals("0", multiply);
    }

    @Test
    void multiply5() { //151 from 311
        String multiply = solution.multiply("123456789", "987654321");

        assertEquals("121932631112635269", multiply);
    }
}