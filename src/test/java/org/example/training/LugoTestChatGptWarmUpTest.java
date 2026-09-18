package org.example.training;

import org.example.lugotest.LugoTestChatGptWarmUp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LugoTestChatGptWarmUpTest {

    private LugoTestChatGptWarmUp unit;

    @BeforeEach
    void setUp() {
        unit = new LugoTestChatGptWarmUp();
    }

    @Test
    void findDuplicates() {
        int[] arr = {4, 2, 7, 2, 4, 9};

        List<Integer> duplicates = unit.findDuplicates(arr);

        assertEquals(2, duplicates.size());
        assertTrue(duplicates.contains(2));
        assertTrue(duplicates.contains(4));
    }

    @Test
    void getTwoSum() {
        int[] arr = {2, 7, 11, 15};

        int[] twoSum = unit.getTwoSum(arr, 9);

        assertEquals(1, twoSum[0]);
        assertEquals(0, twoSum[1]);
    }

    @Test
    void getTwoSum2() {
        int[] arr = {2, 7, 11, 15};

        int[] twoSum = unit.getTwoSum(arr, 26);

        assertEquals(3, twoSum[0]);
        assertEquals(2, twoSum[1]);
    }

    @Test
    void singleIntervalReturnsOne() {
        assertEquals(1, unit.getMaximumNumberOfNonOverlappingIntervals(new int[][]{{1, 3}}));
    }

    @Test
    void twoNonOverlappingIntervals() {
        assertEquals(2, unit.getMaximumNumberOfNonOverlappingIntervals(new int[][]{{1, 2}, {3, 4}}));
    }

    @Test
    void twoTouchingIntervalsAreNonOverlapping() {
        // last end == next start is allowed
        assertEquals(2, unit.getMaximumNumberOfNonOverlappingIntervals(new int[][]{{1, 2}, {2, 3}}));
    }

    @Test
    void twoOverlappingIntervalsReturnsOne() {
        assertEquals(1, unit.getMaximumNumberOfNonOverlappingIntervals(new int[][]{{1, 4}, {2, 3}}));
    }

    @Test
    void unsortedIntervals() {
        assertEquals(3, unit.getMaximumNumberOfNonOverlappingIntervals(new int[][]{{5, 6}, {1, 2}, {3, 4}}));
    }

    @Test
    void multipleIntervalsWithOverlaps() {
        int[][] intervals = {{1, 3}, {2, 4}, {3, 5}, {4, 6}, {5, 7}};
        // Optimal: [1,3], [3,5], [5,7] => 3
        assertEquals(3, unit.getMaximumNumberOfNonOverlappingIntervals(intervals));
    }

    @Test
    void emptyArrayReturnsEmpty() {
        int[][] result = unit.mergeOverlappingIntervals(new int[][]{});
        assertArrayEquals(new int[][]{}, result);
    }

    @Test
    void singleIntervalReturnsItself() {
        int[][] result = unit.mergeOverlappingIntervals(new int[][]{{1, 4}});
        assertArrayEquals(new int[][]{{1, 4}}, result);
    }

    @Test
    void nonOverlappingIntervalsStaySeparate() {
        int[][] result = unit.mergeOverlappingIntervals(new int[][]{{1, 2}, {3, 4}, {5, 6}});
        assertArrayEquals(new int[][]{{1, 2}, {3, 4}, {5, 6}}, result);
    }

    @Test
    void twoOverlappingIntervalsAreMerged() {
        int[][] result = unit.mergeOverlappingIntervals(new int[][]{{1, 4}, {2, 5}});
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }

    @Test
    void touchingIntervalsAreMerged() {
        // last[1] == current[0] -> your condition (>=) merges them
        int[][] result = unit.mergeOverlappingIntervals(new int[][]{{1, 3}, {3, 5}});
        assertArrayEquals(new int[][]{{1, 5}}, result);
    }

    @Test
    void multipleIntervalsCollapseIntoOne() {
        int[][] result = unit.mergeOverlappingIntervals(
                new int[][]{{1, 4}, {2, 6}, {5, 8}, {7, 10}});
        assertArrayEquals(new int[][]{{1, 10}}, result);
    }

    @Test
    void mixtureOfMergedAndSeparateGroups() {
        int[][] result = unit.mergeOverlappingIntervals(
                new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}});
        assertArrayEquals(new int[][]{{1, 6}, {8, 10}, {15, 18}}, result);
    }

    // ⚠️ This test will FAIL with the current implementation.
    // Because last[1] = current[1] replaces the end with a SMALLER value.
    @Test
    void nestedIntervalKeepsTheLargerEnd() {
        // [1,10] fully contains [2,3] -> expected result is still [1,10]
        int[][] result = unit.mergeOverlappingIntervals(new int[][]{{1, 10}, {2, 3}});
        assertArrayEquals(new int[][]{{1, 10}}, result); // fails: returns [1, 3]
    }

    @Test
    void getFirstNonRepeatingChar() {
        assertEquals('w', unit.getFirstNonRepeatingChar("swiss"));
    }

    @Test
    void isValidParentheses() {
        assertTrue(unit.isValidParentheses("{[()]}"));
        assertFalse(unit.isValidParentheses("{[(]}"));
        assertTrue(unit.isValidParentheses("{}"));
    }

    @Test
    void findIntersection() {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 4, 5};

        int[] intersection = unit.findIntersection(arr1, arr2);

        assertEquals(2, intersection[0]);
        assertEquals(4, intersection[1]);
    }
}