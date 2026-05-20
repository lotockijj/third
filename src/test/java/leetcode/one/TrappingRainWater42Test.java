package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrappingRainWater42Test {

    private TrappingRainWater42 solution;

    @BeforeEach
    void setUp() {
        solution = new TrappingRainWater42();
    }

    @Test
    void trap1() {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        int trap = solution.trap(arr);

        assertEquals(6, trap);
    }

    @Test
    void trap2() {
        int[] arr = {4, 2, 0, 3, 2, 5};

        int trap = solution.trap(arr);

        assertEquals(9, trap);
    }
}