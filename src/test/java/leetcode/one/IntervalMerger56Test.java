package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntervalMerger56Test {

    private IntervalMerger56 unit;

    @BeforeEach
    void setUp() {
        unit = new IntervalMerger56();
    }

    @Test
    void merge1() {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] merged = unit.merge(intervals);

        assertEquals(3, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(6, merged[0][1]);
    }

    @Test
    void merge2() {
        int[][] intervals = {{1, 4}, {4, 5}};

        int[][] merged = unit.merge(intervals);

        assertEquals(1, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(5, merged[0][1]);
    }

    @Test
    void merge3() {
        int[][] intervals = {{4, 7}, {1, 4}};

        int[][] merged = unit.merge(intervals);

        assertEquals(1, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(7, merged[0][1]);
    }

    @Test
    void merge4() {
        int[][] intervals = {{1, 4}, {1, 4}};

        int[][] merged = unit.merge(intervals);

        assertEquals(1, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(4, merged[0][1]);
    }

    @Test
        //89 / 172 testcases passed
    void merge5() {
        int[][] intervals = {{1, 4}, {0, 4}};

        int[][] merged = unit.merge(intervals);

        assertEquals(1, merged.length);
        assertEquals(0, merged[0][0]);
        assertEquals(4, merged[0][1]);
    }

    @Test
        //96 / 172 testcases passed
    void merge6() {
        int[][] intervals = {{1, 4}, {2, 3}};

        int[][] merged = unit.merge(intervals);

        assertEquals(1, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(4, merged[0][1]);
    }

    @Test
        //97 / 172 testcases passed
    void merge7() {
        int[][] intervals = {{2, 3}, {4, 5}, {6, 7}, {8, 9}, {1, 10}};

        int[][] merged = unit.merge(intervals);

        assertEquals(1, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(10, merged[0][1]);
    }

    @Test
        //125 / 172 testcases passed
    void merge8() {
        int[][] intervals = {{5, 5}, {1, 3}, {3, 5}, {4, 6}, {1, 1}, {3, 3}, {5, 6}, {3, 3}, {2, 4}, {0, 0}};

        int[][] merged = unit.merge(intervals);

        assertEquals(2, merged.length);
        assertEquals(0, merged[0][0]);
        assertEquals(6, merged[1][1]);
    }

    @Test
        //146 / 172 testcases passed
    void merge9() {
        int[][] intervals = {
                {0, 0}, {1, 2}, {5, 5}, {2, 4}, {3, 3}, {5, 6},
                {5, 6}, {4, 6}, {0, 0}, {1, 2}, {0, 2}, {4, 5}
        };

        int[][] merged = unit.merge(intervals);

        assertEquals(1, merged.length);
        assertEquals(0, merged[0][0]);
        assertEquals(6, merged[0][1]);
    }

    @Test
        //149 / 172 testcases passed
    void merge10() {
        int[][] intervals = {
                {1, 1}, {8, 10}, {4, 6}, {5, 8}, {9, 11}, {9, 11},
                {7, 7}, {8, 12}, {9, 10}, {4, 6}, {8, 12}, {5, 9}
        };

        int[][] merged = unit.merge(intervals);

        assertEquals(2, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(12, merged[1][1]);
    }

    @Test
    void merge11() {
        int[][] intervals = {
                {1, 1}, {8, 10}, {4, 6}, {5, 8}, {9, 11}, {9, 11},
                {7, 7}, {8, 12}, {9, 10}, {4, 6}, {8, 12}, {5, 9}
        };

        int[][] merged = unit.merge(intervals);

        assertEquals(2, merged.length);
        assertEquals(1, merged[0][0]);
        assertEquals(1, merged[0][1]);
        assertEquals(4, merged[1][0]);
        assertEquals(12, merged[1][1]);
    }
}