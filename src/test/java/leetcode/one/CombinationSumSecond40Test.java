package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumSecond40Test {

    private CombinationSumSecond40 unit;

    @BeforeEach
    void setUp() {
        unit = new CombinationSumSecond40();
    }

    @Test
    void combinationSum2() {
        int[] arr = {10, 1, 2, 7, 6, 1, 5};

        List<List<Integer>> lists = unit.combinationSum2(arr, 8);

        List<Integer> firstElements = lists.get(0);
        List<Integer> firstExpectedElements = List.of(1, 1, 6);
        assertTrue(firstElements.size() == firstExpectedElements.size() &&
                firstElements.containsAll(firstExpectedElements) &&
                firstExpectedElements.containsAll(firstElements));

        List<Integer> secondElements = lists.get(1);
        List<Integer> secondExpectedElements = List.of(1, 2, 5);
        assertTrue(secondElements.size() == secondExpectedElements.size() &&
                secondElements.containsAll(secondExpectedElements) &&
                secondExpectedElements.containsAll(secondElements));

        List<Integer> thirdElements = lists.get(2);
        List<Integer> thirdExpectedElements = List.of(1, 7);
        assertTrue(thirdElements.size() == thirdExpectedElements.size() &&
                thirdElements.containsAll(thirdExpectedElements) &&
                thirdExpectedElements.containsAll(thirdElements));

        List<Integer> forthElements = lists.get(3);
        List<Integer> forthExpectedElements = List.of(2, 6);
        assertTrue(forthElements.size() == forthExpectedElements.size() &&
                forthElements.containsAll(forthExpectedElements) &&
                forthExpectedElements.containsAll(forthElements));
    }
}