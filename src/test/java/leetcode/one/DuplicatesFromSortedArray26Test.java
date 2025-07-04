package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesFromSortedArray26Test {

    private DuplicatesFromSortedArray26 sortedArray26;

    @BeforeEach
    void setUp() {
        sortedArray26 = new DuplicatesFromSortedArray26();
    }

    @Test
    void removeDuplicates1() {
        int[] arr = {1,1,2};

        int actual = sortedArray26.removeDuplicates(arr);

        assertEquals(2, actual);
    }

    @Test
    void removeDuplicates2() {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};

        int actual = sortedArray26.removeDuplicates(arr);

        assertEquals(5, actual);
    }

    @Test
    void removeDuplicates3() {
        int[] arr = {1,1,2,4,4};

        int actual = sortedArray26.removeDuplicates(arr);

        assertEquals(3, actual);
    }
}