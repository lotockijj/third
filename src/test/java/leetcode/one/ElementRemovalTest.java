package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ElementRemovalTest {

    private ElementRemoval solution;

    @BeforeEach
    void setUp() {
        solution = new ElementRemoval();
    }

    @Test
    void removeElement1() {
        int[] arr = {3, 2, 2, 3};

        int i = solution.removeElement(arr, 3);

        assertEquals(2, i);
        assertEquals(2, arr[0]);
        assertEquals(2, arr[1]);
    }

    @Test
        //expected [0,1,4,0,3]
    void removeElement2() {
        int[] arr = {0, 1, 2, 2, 3, 0, 4, 2};

        int i = solution.removeElement(arr, 2);

        assertEquals(5, i);
        assertEquals(0, arr[0]);
        assertEquals(1, arr[1]);
        assertEquals(4, arr[2]);
        assertEquals(0, arr[3]);
        assertEquals(3, arr[4]);
    }
}