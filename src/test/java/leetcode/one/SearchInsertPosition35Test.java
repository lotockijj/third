package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPosition35Test {

    private SearchInsertPosition35 insertPosition;

    @BeforeEach
    void setUp() {
        insertPosition = new SearchInsertPosition35();
    }

    @Test
    void searchInsert1() {
        int[] arr = {1,3,5,6};

        int actual = insertPosition.searchInsert(arr, 5);

        assertEquals(2, actual);
    }

    @Test
    void searchInsert2() {
        int[] arr = {1,3,5,6};

        int actual = insertPosition.searchInsert(arr, 2);

        assertEquals(1, actual);
    }

    @Test
    void searchInsert3() {
        int[] arr = {1,3,5,6};

        int actual = insertPosition.searchInsert(arr, 7);

        assertEquals(4, actual);
    }
}