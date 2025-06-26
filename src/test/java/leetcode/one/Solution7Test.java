package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution7Test {

    private Solution7 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution7();
    }

    @Test
    void function1() {
        int actual = solution.function(123);

        assertEquals(321, actual);
    }

    @Test
    void function2() {
        int actual = solution.function(-123);

        assertEquals(-321, actual);
    }

    @Test
    void function3() {
        int actual = solution.function(120);

        assertEquals(21, actual);
    }

    @Test
    void function4() {
        int actual = solution.function(9646324351L);
        //                               2147483647

        assertEquals(1534236469, actual);
    }
}