package org.example.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestFourTest {

    @Test
    void solution1() {
        int[] arr = {3, 5, 9};

        int result = LargestFour.solution(arr);

        assertEquals(17, result);
    }

    @Test
    void solution2() {
        int[] arr = {3, 5, 9, 4, 12};

        int result = LargestFour.solution(arr);

        assertEquals(30, result);
    }

    @Test
    void solution3() {
        int[] arr = {500, 90, 3, 5, 10, 100};

        int result = LargestFour.solution(arr);

        assertEquals(700, result);
    }
}