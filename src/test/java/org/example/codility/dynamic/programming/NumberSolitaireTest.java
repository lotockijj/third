package org.example.codility.dynamic.programming;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberSolitaireTest {

    private NumberSolitaire numberSolitaire;

    @BeforeEach
    void setUp() {
        numberSolitaire = new NumberSolitaire();
    }

    @Test
    void solution1() {
        int[] A = {1,-2, 0, 9, -1, -2};

        int result = numberSolitaire.solution(A);

        assertEquals(8, result);
    }

    @Test
    void solution2() {
        int[] A = {1,-2, 0, -1, -1, -2, -5, -100, -1, 9, 1};

        int result = numberSolitaire.solution(A);

        assertEquals(11, result);
    }
}