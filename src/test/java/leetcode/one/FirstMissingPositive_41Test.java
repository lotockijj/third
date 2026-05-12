package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstMissingPositive_41Test {

    private FirstMissingPositive_41 firstMissingPositive;

    @BeforeEach
    void setUp() {
        firstMissingPositive = new FirstMissingPositive_41();
    }

    @Test
    void firstMissingPositive1() {
        int[] arr = {1, 2, 0};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(3, i);
    }

    @Test
    void firstMissingPositive2() {
        int[] arr = {3, 4, -1, 1};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(2, i);
    }

    @Test
        //98 / 179 testcases passed
    void firstMissingPositive3() {
        int[] arr = {7, 8, 9, 11, 12};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(1, i);
    }

    @Test
    void firstMissingPositive4() {
        int[] arr = {1};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(2, i);
    }

    @Test
        //100 / 179 testcases passed
    void firstMissingPositive5() {
        int[] arr = {2147483647};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(1, i);
    }

    @Test
    void firstMissingPositive6() {
        int[] arr = {100000, 3, 4000, 2, 15, 1, 99999};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(4, i);
    }

    @Test
        // 114 / 179 testcases passed
    void firstMissingPositive7() {
        int[] arr = {1, 1};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(2, i);
    }

    @Test
        // 168 / 179 testcases passed
    void firstMissingPositive8() {
        int[] arr = {2, 1};

        int i = firstMissingPositive.firstMissingPositive(arr);

        assertEquals(3, i);
    }
}