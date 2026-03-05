package leetcode.asked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeepSeekTest {

    @Test
    void solution1() {
        double[] speeds = {4.0, 2.5, 7.0, 8.5, 3.0, 5.0};

        assertEquals(6.166666666666667, DeepSeek.solution(speeds, 3));
    }

    @Test
    void solution2() {
        double[] speeds = {1, 12, -5, -6, 50, 3};

        assertEquals(12.75, DeepSeek.solution(speeds, 4));
    }
}