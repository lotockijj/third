package org.example.codilitty.coding.skills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParityDegreeTest {

    private ParityDegree parityDegree;

    @BeforeEach
    void setUp() {
        parityDegree = new ParityDegree();
    }

    @Test
    void solution1() {
        int result = parityDegree.solution(24);

        assertEquals(3, result);
    }

    @Test
    void solution2() {
        int result = parityDegree.solution(2);

        assertEquals(1, result);
    }

    @Test
    void solution3() {
        int result = parityDegree.solution(36);

        assertEquals(2, result);
    }

    @Test
    void solution4() {
        int result = parityDegree.solution(129);

        assertEquals(0, result);
    }
}