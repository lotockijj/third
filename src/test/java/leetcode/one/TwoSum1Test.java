package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSum1Test {

    private TwoSum1 twoSum1;

    @BeforeEach
    void setUp() {
        twoSum1 = new TwoSum1();
    }

    @Test
    void twoSum1() {
        int[] arr = {2, 7, 11, 15};

        int[] actual = twoSum1.twoSum(arr, 9);

        assertEquals(0, actual[0]);
        assertEquals(1, actual[1]);
    }

    @Test
    void twoSum2() {
        int[] arr = {3, 2, 4};

        int[] actual = twoSum1.twoSum(arr, 6);

        assertEquals(1, actual[0]);
        assertEquals(2, actual[1]);
    }

    @Test
    void twoSum3() {
        int[] arr = {3, 3};

        int[] actual = twoSum1.twoSum(arr, 6);

        assertEquals(0, actual[0]);
        assertEquals(1, actual[1]);
    }

    @Test
    void twoSum4() {
        int[] arr = {3, 2, 3};

        int[] actual = twoSum1.twoSum(arr, 6);

        assertEquals(0, actual[0]);
        assertEquals(2, actual[1]);
    }
}