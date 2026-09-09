package org.example.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateNumberTest {

    private DuplicateNumber unit;

    @BeforeEach
    void setUp() {
        unit = new DuplicateNumber();
    }

    @Test
    void findDuplicate1() {
        int[] arr = {1, 3, 4, 2, 2};

        assertEquals(2, unit.findDuplicate(arr));
    }

    @Test
    void findDuplicate2() {
        int[] arr = {3, 1, 3, 4, 2};

        assertEquals(3, unit.findDuplicate(arr));
    }

    @Test
    void findDuplicate3() {
        int[] arr = {1, 1, 2};

        assertEquals(1, unit.findDuplicate(arr));
    }
}