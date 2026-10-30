package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution72Test {

    private Solution72 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution72();
    }

    @Test
    void minDistance() {
        assertEquals(3, unit.minDistance("horse", "ros"));
        assertEquals(5, unit.minDistance("intention", "execution"));
    }
}