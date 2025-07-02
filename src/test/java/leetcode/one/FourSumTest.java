package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FourSumTest {

    private FourSum fourSum;

    @BeforeEach
    void setUp() {
        fourSum = new FourSum();
    }

    @Test
    void fourSum1() {
        int[] arr = {1, 0, -1, 0, -2, 2};

        List<List<Integer>> actual = fourSum.fourSum(arr, 0);

        assertEquals(3, actual.size());
        assertTrue(actual.contains(List.of(-2, 0, 0, 2)));
        assertTrue(actual.contains(List.of(-2, -1, 1, 2)));
        assertTrue(actual.contains(List.of(-1, 0, 0, 1)));
    }

    @Test
    void fourSum2() {
        int[] arr = {2, 2, 2, 2, 2};

        List<List<Integer>> actual = fourSum.fourSum(arr, 8);

        assertTrue(actual.contains(List.of(2, 2, 2, 2)));
        assertEquals(1, actual.size());
    }

    @Test
    void fourSum3() {
        int[] arr = {0};

        List<List<Integer>> actual = fourSum.fourSum(arr, 0);

        assertTrue(actual.isEmpty());
    }

    @Test
    void fourSum4() {
        //Fix :=> if(!result.add(List.of(first, second, third, fourth))) break;
        long start = System.nanoTime();
        int[] arr = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2};

        List<List<Integer>> actual = fourSum.fourSum(arr, 8);

        assertTrue(actual.contains(List.of(2, 2, 2, 2)));
        assertEquals(1, actual.size());

        System.out.println(TimeUnit.MILLISECONDS.toSeconds((System.nanoTime() - start)));
    }

    @Test
    void fourSum5() {
        int[] arr = {1000000000, 1000000000, 1000000000, 1000000000};

        List<List<Integer>> actual = fourSum.fourSum(arr, -294967296);

        assertFalse(actual.contains(List.of(1000000000, 1000000000, 1000000000, 1000000000)));
        assertTrue(actual.isEmpty());
    }

    @Test
    void fourSum6() {
        int[] arr = {0, 0, 0, -1000000000, -1000000000, -1000000000, -1000000000};

        List<List<Integer>> actual = fourSum.fourSum(arr, -1000000000);

        assertTrue(actual.contains(List.of(-1000000000, 0, 0, 0)));
    }
}