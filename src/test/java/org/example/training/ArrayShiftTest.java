package org.example.training;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayShiftTest {

    @Test
    void shiftArray1() {
        int[] arr = {1, 3, 5, 9, 6, 7, 2};

        int[] actual = ArrayShift.shiftArray(arr, 1);

        int[] expected = {2, 1, 3, 5, 9, 6, 7};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shiftArray2() {
        int[] arr = {1, 3, 5, 9, 6, 7, 2};

        int[] actual = ArrayShift.shiftArray(arr, 2);

        int[] expected = {7, 2, 1, 3, 5, 9, 6};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shiftArray3() {
        int[] arr = {1, 3, 5, 9, 6, 7, 2};

        int[] actual = ArrayShift.shiftArray(arr, 5);

        int[] expected = {5, 9, 6, 7, 2, 1, 3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void shiftArray4() {
        int[] arr = {1, 3, 2, 7, 4};

        int[] actual = ArrayShift.shiftArray(arr, 2);

        int[] expected = {7, 4, 1, 3, 2};
        assertArrayEquals(expected, actual);
    }
}