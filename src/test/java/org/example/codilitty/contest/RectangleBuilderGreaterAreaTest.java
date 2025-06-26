package org.example.codilitty.contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleBuilderGreaterAreaTest {

    private RectangleBuilderGreaterArea rectangleBuilderGreaterArea;

    @BeforeEach
    void setUp() {
        rectangleBuilderGreaterArea = new RectangleBuilderGreaterArea();
    }

    @Test
    void solution1() {
        int[] A = {1,2,5,1,1,2,3,5,1};

        int result = rectangleBuilderGreaterArea.solution(A, 5);

        assertEquals(2, result);
    }

    @Test
    void solution2() {
        int[] A = {1,2,5,1,1,2,3,5,1,6,6};

        int result = rectangleBuilderGreaterArea.solution(A, 5);

        assertEquals(5, result);
    }

    @Test
    void solution3() {
        int[] A = {1,1,2,2,5,5,5,5};

        int result = rectangleBuilderGreaterArea.solution(A, 5);

        assertEquals(3, result);
    }

    @Test
    void solution4() {
        int[] A = {5,5,5,5,6,6,6,6};

        int result = rectangleBuilderGreaterArea.solution(A, 5);

        assertEquals(3, result);
    }

    @Test
    void solution5() {
        int[] A = {2,3,2,3};

        int result = rectangleBuilderGreaterArea.solution(A, 5);

        assertEquals(1, result);
    }
}