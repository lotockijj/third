package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstLastElement34Test {

    private FirstLastElement34 firstLastElement34;

    @BeforeEach
    void setUp() {
        firstLastElement34 = new FirstLastElement34();
    }

    @Test
    void searchRange1() {
        int[] arr = {5, 7, 7, 8, 8, 10};

        int[] actual = firstLastElement34.searchRange(arr, 8);

        assertEquals(3, actual[0]);
        assertEquals(4, actual[1]);
    }

    @Test
    void searchRange2() {
        int[] arr = {5, 7, 7, 8, 8, 10};

        int[] actual = firstLastElement34.searchRange(arr, 6);

        assertEquals(-1, actual[0]);
        assertEquals(-1, actual[1]);
    }

    @Test
    void searchRange3() {
        int[] arr = {};

        int[] actual = firstLastElement34.searchRange(arr, 0);

        assertEquals(-1, actual[0]);
        assertEquals(-1, actual[1]);
    }

    @Test
    void searchRange4() {
        int[] arr = {1};

        int[] actual = firstLastElement34.searchRange(arr, 1);

        assertEquals(0, actual[0]);
        assertEquals(0, actual[1]);
    }
}