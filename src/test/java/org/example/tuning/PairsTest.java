package org.example.tuning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairsTest {

    private Pairs pairs;

    @BeforeEach
    void setUp() {
        pairs = new Pairs();
    }

    @Test
    void getAllPairs1() {
        int[] arr = {5, 5, 8, 8, 8, 8, 8};

        int allPairs = pairs.getAllPairs(arr);

        assertEquals(3, allPairs);
    }

    @Test
    void getAllPairs2() {
        int[] arr = {5, 5, 5};

        int allPairs = pairs.getAllPairs(arr);

        assertEquals(1, allPairs);
    }

    @Test
    void getAllPairs3() {
        int[] arr = {1, 2, 3};

        int allPairs = pairs.getAllPairs(arr);

        assertEquals(-1, allPairs);
    }
}