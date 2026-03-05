package leetcode.asked;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Miro1Test {

    @Test
    void solution1() {
        int[] boxes = {3, 5, 6, 10, 8};
        int[] checkpoints = {0, 2, 3, 4};

        assertEquals(4, Miro1.solution(boxes, checkpoints));
    }

    @Test
    void solution2() {
        int[] boxes = {1, 2, 1, 2, 1};
        int[] checkpoints = {0, 2, 4};

        assertEquals(0, Miro1.solution(boxes, checkpoints));
    }
}