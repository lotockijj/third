package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSum39Test {

    private CombinationSum39 combinationSum;

    @BeforeEach
    void setUp() {
        combinationSum = new CombinationSum39();
    }

    @Test
    void combinationSum1() {
        int[] arr = {2, 3, 6, 7};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 7);

        List<Integer> expected1 = List.of(2, 2, 3);
        List<Integer> expected2 = List.of(7);

        assertTrue(actual.contains(expected1));
        assertTrue(actual.contains(expected2));
    }

    @Test
    void combinationSum2() {
        int[] arr = {2, 3, 5};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 8);

        List<Integer> expected1 = List.of(2, 2, 2, 2);
        List<Integer> expected2 = List.of(2, 3, 3);
        List<Integer> expected3 = List.of(3, 5);

        assertTrue(actual.contains(expected1));
        assertTrue(actual.contains(expected2));
        assertTrue(actual.contains(expected3));
    }

    @Test
    void combinationSum3() {
        int[] arr = {2};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 1);

        assertTrue(actual.isEmpty());
    }

    @Test
    void combinationSum4() {
        int[] arr = {7, 3};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 17);

        assertTrue(actual.contains(List.of(3, 7, 7)));
    }

    @Test
    void combinationSum5() {
        int[] arr = {7, 3, 2};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 18);

        assertTrue(actual.contains(List.of(2, 2, 2, 2, 2, 2, 2, 2, 2)));
        assertTrue(actual.contains(List.of(3, 3, 3, 3, 3, 3)));
        assertTrue(actual.contains(List.of(2, 2, 2, 2, 3, 7)));
    }

    @Test
    void combinationSum6() {
        int[] arr = {3, 2, 8};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 18);

        assertTrue(actual.contains(List.of(2, 2, 2, 2, 2, 2, 2, 2, 2)));
        assertTrue(actual.contains(List.of(3, 3, 3, 3, 3, 3)));
        assertTrue(actual.contains(List.of(2, 8, 8)));
        assertEquals(7, actual.size());
    }

    @Test
    void combinationSum7() {
        int[] arr = {4, 2, 7, 5, 6};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 16);

        assertTrue(actual.contains(List.of(2, 2, 2, 5, 5)));
        assertTrue(actual.contains(List.of(2, 2, 2, 4, 6)));
        assertTrue(actual.contains(List.of(4, 6, 6)));
    }

    @Test
    void combinationSum8() {
        int[] arr = {6, 4, 3, 10, 12};

        List<List<Integer>> actual = combinationSum.combinationSum(arr, 28);

        assertTrue(actual.contains(List.of(4, 12, 12)));
        assertTrue(actual.contains(List.of(4, 4, 4, 4, 6, 6)));
        assertTrue(actual.contains(List.of(3, 3, 10, 12)));
        assertEquals(23, actual.size());
        assertTrue(actual.contains(List.of(4, 4, 4, 4, 4, 4, 4)));
    }
}