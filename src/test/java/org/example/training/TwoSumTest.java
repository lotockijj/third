package org.example.training;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @CsvSource({
            "9, 0, 1",
            "18, 1, 2",
            "13, 0, 2",
            "17, 0, 3"
    })
    void twoSumTest(int target, int expectedIdx1, int expectedIdx2) {
        int[] arr = {2, 7, 11, 15};
        int[] result = twoSum.twoSum(arr, target);
        assertArrayEquals(new int[]{expectedIdx1, expectedIdx2}, result);
    }
}