package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGame55Test {

    private JumpGame55 unit;

    @BeforeEach
    void setUp() {
        unit = new JumpGame55();
    }

    @Test
    void canJump1() {
        int[] nums = {2, 3, 1, 1, 4};

        assertTrue(unit.canJump(nums));
    }

    @Test
    void canJump2() {
        int[] nums = {3, 2, 1, 0, 4};

        assertFalse(unit.canJump(nums));
    }
}