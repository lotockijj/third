package org.example.codility.greedy.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TieRopesTest {

    private TieRopes tieRopes;

    @BeforeEach
    void setUp() {
        tieRopes = new TieRopes();
    }

    @Test
    void solution() {
        int[] A = {1,2,3,4,1,1,3};

        int result = tieRopes.solution(4, A);

        assertEquals(3, result);
    }
}