package org.example.codility.stacks.and.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Brackets2Test {

    private Brackets2 brackets2;

    @BeforeEach
    void setUp() {
        brackets2 = new Brackets2();
    }

    @Test
    void solution1() {
        assertTrue(brackets2.isBalanced("{[()()]}"));
    }

    @Test
    void solution2() {
        assertFalse(brackets2.isBalanced("([)()]"));
    }

    @Test
    void solution3() {
        assertTrue(brackets2.isBalanced("[[[]]]"));
    }

    @Test
    void solution4() {
        assertTrue(brackets2.isBalanced("((({{{[[[({}{})({}{})]]]}}})))"));
    }
}