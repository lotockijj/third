package org.example.codility.stacks.and.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NestingTest {

    private Nesting nesting;

    @BeforeEach
    void setUp() {
        nesting = new Nesting();
    }

    @Test
    void solution1() {
        int result = nesting.solution("(()(())())");

        assertEquals(1, result);
    }

    @Test
    void solution2() {
        int result = nesting.solution("())");

        assertEquals(0, result);
    }

    @Test
    void solution3() {
        int result = nesting.solution("(((((()(())())))))");

        assertEquals(1, result);
    }

    @Test
    void solution4() {
        int result = nesting.solution("((()))");

        assertEquals(1, result);
    }

    @Test
    void solution5() {
        int result = nesting.solution("(((()())))");

        assertEquals(1, result);
    }

    @Test
    void solution6() {
        int result = nesting.solution(")(");

        assertEquals(0, result);
    }
}