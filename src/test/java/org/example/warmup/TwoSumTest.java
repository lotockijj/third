package org.example.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    private TwoSum twoSum;

    @BeforeEach
    void setUp() {
        twoSum = new TwoSum();
    }

    @Test
    void getZeroSum1() {
        List<Integer> expected = List.of(-1, 1);
        int[] arr = {-1, 2, 3, 1};

        List<List<Integer>> actual = twoSum.getZeroSum(arr);

        assertTrue(actual.contains(expected));
        assertEquals(1, actual.size());
    }

    @Test
    void getZeroSum2() {
        List<Integer> expected = List.of(-1, 1);
        int[] arr = {-1, 2, 3, 1, 7, -7, 4, -4, 1001, -1001};

        List<List<Integer>> actual = twoSum.getZeroSum(arr);

        assertTrue(actual.contains(expected));
        assertTrue(actual.contains(List.of(-7, 7)));
        assertTrue(actual.contains(List.of(-4, 4)));
        assertTrue(actual.contains(List.of(-1001, 1001)));
    }
}