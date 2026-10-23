package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution70Test {

    private Solution70 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution70();
    }

    @Test
    void climbStairs() {

        assertEquals(2, unit.climbStairs(2));
        assertEquals(3, unit.climbStairs(3));
        assertEquals(3, unit.climbStairs(3));
    }
}