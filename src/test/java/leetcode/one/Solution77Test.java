package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution77Test {

    private Solution77 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution77();
    }

    @Test
    void combine1() {
        List<List<Integer>> actual = unit.combine(4, 2);

        assertEquals(6, actual.size());
    }

    @Test
    void combine2() {
        List<List<Integer>> actual = unit.combine(1, 1);

        assertEquals(1, actual.size());
    }

    @Test //9 / 27 testcases passed
    void combine3() {
        List<List<Integer>> actual = unit.combine(3, 3);

        assertEquals(1, actual.size());
        assertEquals(1, actual.get(0).get(0));
        assertEquals(2, actual.get(0).get(1));
        assertEquals(3, actual.get(0).get(2));
    }

    @Test
    void combineWithRepetition(){
        assertEquals(6, unit.combineWithRepetition(3, 2).size());
        assertEquals(10, unit.combineWithRepetition(4, 2).size());
        assertEquals(10, unit.combineWithRepetition(3, 3).size());
    }
}