package org.example.training;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LeetCodeSqrt69Test {

    private LeetCodeSqrt69 unit;

    @BeforeEach
    void setUp() {
        unit = new LeetCodeSqrt69();
    }

    @Test
    void mySqrt() {
        assertEquals(2, unit.mySqrt(4));
        assertEquals(2, unit.mySqrt(8));
        assertEquals(1, unit.mySqrt(2));
        assertEquals(1, unit.mySqrt(1));
        assertEquals(1, unit.mySqrt(3));
        assertEquals(46340, unit.mySqrt(2147395600));
    }
}