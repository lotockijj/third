package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution57Test {

    private Solution57 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution57();
    }

    @Test
    void insert1() {
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(2, insert.length);
        assertEquals(1, insert[0][0]);
        assertEquals(5, insert[0][1]);
        assertEquals(6, insert[1][0]);
        assertEquals(9, insert[1][1]);
    }

    @Test
        //45 / 158 testcases passed
    void insert2() {
        int[][] intervals = {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = {4, 8};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(3, insert.length);
        assertEquals(1, insert[0][0]);
        assertEquals(2, insert[0][1]);
        assertEquals(3, insert[1][0]);
        assertEquals(10, insert[1][1]);
    }

    @Test
    void insert3() {
        int[][] intervals = {};
        int[] newInterval = {5, 7};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(5, insert[0][0]);
        assertEquals(7, insert[0][1]);

    }

    @Test
    void insert4() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {1, 7};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(1, insert[0][0]);
        assertEquals(7, insert[0][1]);
    }

    @Test
    void insert5() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {6, 8};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(2, insert.length);
        assertEquals(6, insert[1][0]);
        assertEquals(8, insert[1][1]);
    }

    @Test
    void insert6() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {0, 3};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(0, insert[0][0]);
        assertEquals(5, insert[0][1]);
    }

    @Test
    void insert7() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {0, 0};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(2, insert.length);
        assertEquals(0, insert[0][0]);
        assertEquals(0, insert[0][1]);
    }

    @Test
    void insert8() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {0, 5};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(0, insert[0][0]);
        assertEquals(5, insert[0][1]);
    }

    @Test
    void insert9() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {0, 6};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(0, insert[0][0]);
        assertEquals(6, insert[0][1]);
    }

    @Test
    void insert10() {
        int[][] intervals = {{1, 5}, {6, 8}};
        int[] newInterval = {5, 6};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(1, insert[0][0]);
        assertEquals(8, insert[0][1]);
    }

    @Test
        //140 / 158 testcases passed
    void insert11() {
        int[][] intervals = {{1, 5}};
        int[] newInterval = {2, 3};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(1, insert[0][0]);
        assertEquals(5, insert[0][1]);
    }

    @Test
        //148 / 158 testcases passed
    void insert12() {
        int[][] intervals = {{1, 5}, {6, 8}};
        int[] newInterval = {3, 7};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(1, insert.length);
        assertEquals(1, insert[0][0]);
        assertEquals(8, insert[0][1]);
    }

    @Test
    void insert13() {
        int[][] intervals = {{3, 5}, {12, 15}};
        int[] newInterval = {6, 6};

        int[][] insert = unit.insert(intervals, newInterval);

        assertEquals(3, insert.length);
        assertEquals(6, insert[1][0]);
        assertEquals(6, insert[1][1]);
        assertEquals(12, insert[2][0]);
    }
}