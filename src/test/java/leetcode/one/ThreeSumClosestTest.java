package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeSumClosestTest {

    private ThreeSumClosest sumClosest;

    @BeforeEach
    void setUp() {
        sumClosest = new ThreeSumClosest();
    }

    @Test
    void threeSumClosest1() {
        int[] arr = {-1, 2, 1, -4};

        int actual = sumClosest.threeSumClosest(arr, 1);

        assertEquals(2, actual);
    }

    @Test
    void threeSumClosest2() {
        int[] arr = {0, 0, 0};

        int actual = sumClosest.threeSumClosest(arr, 1);

        assertEquals(0, actual);
    }

    @Test
    void threeSumClosest3() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int actual = sumClosest.threeSumClosest(arr, 1);

        assertEquals(60, actual);
    }

    @Test
    void threeSumClosest4() {
        int[] arr = {4, 0, 5, -5, 3, 3, 0, -4, -5};

        int actual = sumClosest.threeSumClosest(arr, -2);

        assertEquals(-2, actual);
    }

    @Test
    void threeSumClosest5() {
        int[] arr = {-1000, -5, -5, -5, -5, -5, -5, -1, -1, -1};

        int actual = sumClosest.threeSumClosest(arr, -14);

        assertEquals(-15, actual);
    }

    @Test
    void threeSumClosest6() {
        int[] arr = {-2, -1, 1, 4};

        int actual = sumClosest.threeSumClosest(arr, 0);

        assertEquals(1, actual);
    }
}