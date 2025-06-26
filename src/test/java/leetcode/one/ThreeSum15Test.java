package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ThreeSum15Test {

    private ThreeSum15 threeSum;

    @BeforeEach
    void setUp() {
        threeSum = new ThreeSum15();
    }

    @Test
    void threeSum1() {
        List<Integer> firstExpected = List.of(-1, -1, 2);
        List<Integer> secondExpected = List.of(-1, 0, 1);
        int[] arr = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> lists = threeSum.threeSum(arr);

        assertTrue(lists.contains(firstExpected));
        assertTrue(lists.contains(secondExpected));
        assertEquals(2, lists.size());
    }

    @Test
    void threeSum2() {
        List<Integer> firstExpected = List.of(0, 0, 0);
        int[] arr = {0, 0, 0};

        List<List<Integer>> lists = threeSum.threeSum(arr);

        assertTrue(lists.contains(firstExpected));
    }

    @Test
    void threeSum3() {
        List<Integer> firstExpected = List.of(-1, 0, 1);
        int[] arr = {0, 1, -1};

        List<List<Integer>> lists = threeSum.threeSum(arr);

        assertTrue(lists.contains(firstExpected));
    }

    @Test
    void threeSum4() {
        List<Integer> firstExpected = List.of(-5, 1, 4);
        List<Integer> secondExpected = List.of(-4, 0, 4);
        List<Integer> thirdExpected = List.of(-4, 1, 3);
        List<Integer> fourthExpected = List.of(-2, -2, 4);
        List<Integer> fifthExpected = List.of(-2, 1, 1);
        List<Integer> sixthExpected = List.of(0, 0, 0);

        int[] arr = {-4, -2, 1, -5, -4, -4, 4, -2, 0, 4, 0, -2, 3, 1, -5, 0};

        List<List<Integer>> lists = threeSum.threeSum(arr);

        assertTrue(lists.contains(firstExpected));
        assertTrue(lists.contains(secondExpected));
        assertTrue(lists.contains(thirdExpected));
        assertTrue(lists.contains(fourthExpected));
        assertTrue(lists.contains(fifthExpected));
        assertTrue(lists.contains(sixthExpected));
    }

}