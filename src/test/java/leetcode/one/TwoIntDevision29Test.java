package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoIntDevision29Test {

    private TwoIntDevision29 intDevision29;

    @BeforeEach
    void setUp() {
        intDevision29 = new TwoIntDevision29();
    }

    @Test
    void divide1() {
        assertEquals(3, intDevision29.divide(10, 3));
    }

    @Test
    void divide2() {
        assertEquals(-2, intDevision29.divide(7, -3));
    }

    @Test
    void divide3() {
        assertEquals(2147483647, intDevision29.divide(-2147483648, -1));
    }

    @Test
    void divide4() {
        assertEquals(2147483647, intDevision29.divide(-2147483648, -1));
    }

    @Test
    void divide5() {
        assertEquals(-2147483648, intDevision29.divide(-2147483648, 1));
    }

    @Test
    void divide6() {
        assertEquals(1073741823, intDevision29.divide(2147483647, 2));
    }
}