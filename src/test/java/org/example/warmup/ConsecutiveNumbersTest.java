package org.example.warmup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsecutiveNumbersTest {

    @Test
    void solution1() {
        int[] arr = {1, 5};

        assertEquals(3, ConsecutiveNumbers.solution(arr));
    }

    @Test
    void solution2() {
        int[] arr = {1, 3, 5};

        assertEquals(2, ConsecutiveNumbers.solution(arr));
    }

    @Test
    void solution3() {
        int[] arr = { 3, 4, 5, 6, 7, 8, 10};

        assertEquals(1, ConsecutiveNumbers.solution(arr));
    }
}