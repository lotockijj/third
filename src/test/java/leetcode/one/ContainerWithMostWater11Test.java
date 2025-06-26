package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWater11Test {

    private ContainerWithMostWater11 container;

    @BeforeEach
    void setUp() {
        container = new ContainerWithMostWater11();
    }

    @Test
    void maxArea1() {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int actual = container.maxArea(arr);

        assertEquals(49, actual);
    }

    @Test
    void maxArea2() {
        int[] arr = {1, 1};

        int actual = container.maxArea(arr);

        assertEquals(1, actual);
    }

    @Test
    void maxArea3() {
        int[] arr = {1, 2, 1};

        int actual = container.maxArea(arr);

        assertEquals(2, actual);
    }
}