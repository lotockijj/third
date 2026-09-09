package org.example.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringReversalTest {

    @Test
    void reverseString1() {
        assertEquals("gfedcba", StringReversal.reverseString("abcdefg"));
    }

    @Test
    void reverseString2() {
        assertEquals("12", StringReversal.reverseString("21"));
    }
}