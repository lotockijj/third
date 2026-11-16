package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution78Test {

    private Solution78 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution78();
    }

    @Test
    void subsets1() {
        int[] arr = {1,2,3};

        List<List<Integer>> actual = unit.subsets(arr);

        assertEquals(8, actual.size());
    }

    @Test
    void subsets2() {
        int[] arr = {0};

        List<List<Integer>> actual = unit.subsets(arr);

        assertEquals(2, actual.size());
        assertEquals(0, actual.get(0).size());
        assertEquals(0, actual.get(1).get(0));
    }
}