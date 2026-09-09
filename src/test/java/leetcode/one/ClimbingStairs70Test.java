package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairs70Test {

    private ClimbingStairs70 unit;

    @BeforeEach
    void setUp() {
        unit = new ClimbingStairs70();
    }

    @Test
    void climbStairs1() {
        assertEquals(1, unit.climbStairs(1));
    }

    @Test
    void climbStairs2() {
        assertEquals(5, unit.climbStairs(4));
    }

    @Test
    void climbStairs3() {
        assertEquals(8, unit.climbStairs(5));
    }
}