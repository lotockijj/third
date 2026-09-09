package org.example.training;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateFinderTest {

    @Test
    void findDuplicates1() {
        int[] arr = {1, 1, 1, 2, 2, 3};

        List<Integer> duplicates = DuplicateFinder.findDuplicates(arr);

        assertEquals(2, duplicates.size());
        assertTrue(duplicates.contains(1));
        assertTrue(duplicates.contains(2));
    }

    @Test
    void findDuplicates2() {
        int[] arr = {1, 1, 1, 2, 2, 3, 4, 4, 5, 6, 1000, 1001, 10001, 10001};

        List<Integer> duplicates = DuplicateFinder.findDuplicates(arr);

        assertEquals(4, duplicates.size());
        assertTrue(duplicates.contains(1));
        assertTrue(duplicates.contains(10001));
    }
}