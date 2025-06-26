package leetcode.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution4Test {

    @Test
    void function1() {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};

        double result = Solution4.function(arr1, arr2);

        assertEquals(2.0, result);
    }

    @Test
    void function2() {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        double result = Solution4.function(arr1, arr2);

        assertEquals(2.5, result);
    }

    @Test
    void function3() {
        int[] arr1 = {0, 0};
        int[] arr2 = {0, 0};

        double result = Solution4.function(arr1, arr2);

        assertEquals(0.0, result);
    }

    @Test
    void function4() {
        int[] arr1 = {1};
        int[] arr2 = {};

        double result = Solution4.function(arr1, arr2);

        assertEquals(1.0, result);
    }

    @Test
    void function5() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};

        double result = Solution4.function(arr1, arr2);

        assertEquals(9.00000, result);
    }
}