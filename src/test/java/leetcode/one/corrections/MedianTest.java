package leetcode.one.corrections;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianTest {

    @Test
    void getMedian1() {
        int[] arr = {1, 2};

        double result = Median.getMedian(arr);

        assertEquals(1.5, result);
    }

    @Test
    void getMedian2() {
        int[] arr = {1, 3};

        double result = Median.getMedian(arr);

        assertEquals(2, result);
    }

    @Test
    void getMedian3() {
        int[] arr = {1, 2, 3, 4};

        double result = Median.getMedian(arr);

        assertEquals(2.5, result);
    }

    @Test
    void getMedian4() {
        int[] arr = {0, 0, 0, 0};

        double result = Median.getMedian(arr);

        assertEquals(0.0, result);
    }

    @Test
    void getMedian5() {
        int[] arr = {1};

        double result = Median.getMedian(arr);

        assertEquals(1.0, result);
    }

    @Test
    void getMedian6() {
        int[] arr = {1, 2, 100};

        double result = Median.getMedian(arr);

        assertEquals(2.0, result);
    }

    @Test
    void getMedian7() {
        int[] arr = {1, 2, 3, 4, 1000, 1001, 1002, 1003, 1004};

        double result = Median.getMedian(arr);

        assertEquals(1000, result);
    }
}