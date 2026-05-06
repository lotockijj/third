package org.example.micro1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookShelfFitterTest {

    @Test
    void fitBooks1() {
        int[] arr = {2, 3, 7, 5};

        List<Integer> integers = BookShelfFitter.fitBooks(arr, 10);

        assertTrue(integers.contains(2));
        assertTrue(integers.contains(3));
        assertTrue(integers.contains(5));
        assertFalse(integers.contains(7));
    }

    @Test
    void fitBooks2() {
        int[] arr = {2, 3, 7, 101};

        List<Integer> integers = BookShelfFitter.fitBooks(arr, 103);

        assertTrue(integers.contains(2));
        assertTrue(integers.contains(101));
        assertFalse(integers.contains(3));
        assertFalse(integers.contains(7));
    }

    @Test
    void fitBooks3() {
        int[] arr = {1, 3, 5, 7, 101};

        List<Integer> integers = BookShelfFitter.fitBooks(arr, 107);

        assertTrue(integers.contains(1));
        assertTrue(integers.contains(5));
        assertTrue(integers.contains(101));
        assertFalse(integers.contains(3));
        assertFalse(integers.contains(7));
    }
}