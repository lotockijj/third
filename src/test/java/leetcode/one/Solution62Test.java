package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution62Test {

    private Solution62 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution62();
    }

    @Test
    void uniquePaths1() {
        assertEquals(28, unit.uniquePaths(3, 7));
    }

    @Test
    void uniquePaths2() {
        assertEquals(3, unit.uniquePaths(3, 2));
    }
}