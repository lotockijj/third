package org.example.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class NeighboursSkipTest {

    @Test
    void removeBiggestNeighbours1() {
        int[] arr = {1, 3, 6, 7, -5};

        int[] actual = NeighboursSkip.removeBiggestNeighbours(arr);

        int[] expected = {1, 3, 6, -5};
        assertEquals(4, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeBiggestNeighbours2() {
        int[] arr = {18, 1, 3, 6, 7, -5};

        int[] actual = NeighboursSkip.removeBiggestNeighbours(arr);

        int[] expected = {1, 3, 6, -5};
        assertEquals(4, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeBiggestNeighbours3() {
        int[] arr = {1, 2, 1, 2, 1, 2};

        int[] actual = NeighboursSkip.removeBiggestNeighbours(arr);

        int[] expected = {1, 1, 1};
        assertEquals(3, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeBiggestNeighbours4() {
        int[] arr = {1, 2};

        int[] actual = NeighboursSkip.removeBiggestNeighbours(arr);

        int[] expected = {1};
        assertEquals(1, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeBiggestNeighbours5() {
        int[] arr = {2, 1};

        int[] actual = NeighboursSkip.removeBiggestNeighbours(arr);

        int[] expected = {1};
        assertEquals(1, actual.length);
        assertArrayEquals(expected, actual);
    }

    @Test
    void removeBiggestNeighbours6() {
        int[] arr = {10, 1, 10, 1, 10};

        int[] actual = NeighboursSkip.removeBiggestNeighbours(arr);

        int[] expected = {1, 1};
        assertEquals(2, actual.length);
        assertArrayEquals(expected, actual);
    }
}