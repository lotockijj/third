package org.example.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestickTest {

    @Test
    void factorial1() {
        assertEquals(1, Testick.factorial(1));
    }

    @Test
    void factorial2() {
        assertEquals(2, Testick.factorial(2));
    }

    @Test
    void factorial3() {
        assertEquals(6, Testick.factorial(3));
    }

    @Test
    void factorial4() {
        assertEquals(120, Testick.factorial(5));
    }
}