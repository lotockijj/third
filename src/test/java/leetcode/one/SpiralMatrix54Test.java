package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpiralMatrix54Test {

    private SpiralMatrix54 unit;

    @BeforeEach
    void setUp() {
        unit = new SpiralMatrix54();
    }

    @Test
    void shouldReturnSpiralFor2x2Matrix() {
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(List.of(1, 2, 4, 3), result);
    }

    @Test
    void shouldReturnSpiralFor3x3Matrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(
                List.of(1, 2, 3, 6, 9, 8, 7, 4, 5),
                result
        );
    }

    @Test
    void shouldReturnSpiralFor3x4Matrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(
                List.of(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7),
                result
        );
    }

    @Test
    void shouldReturnSpiralFor4x3Matrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(
                List.of(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8),
                result
        );
    }

    @Test
    void shouldReturnSpiralForSingleRow() {
        int[][] matrix = {
                {1, 2, 3, 4, 5}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void shouldReturnSpiralForSingleColumn() {
        int[][] matrix = {
                {1},
                {2},
                {3},
                {4},
                {5}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(List.of(1, 2, 3, 4, 5), result);
    }

    @Test
    void shouldReturnSingleElement() {
        int[][] matrix = {
                {42}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(List.of(42), result);
    }

    @Test
    void shouldReturnSpiralFor4x4Matrix() {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(
                List.of(
                        1, 2, 3, 4,
                        8, 12, 16,
                        15, 14, 13,
                        9, 5,
                        6, 7, 11, 10
                ),
                result
        );
    }

    @Test
    void shouldReturnSpiralFor5x5Matrix() {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        List<Integer> result = unit.spiralOrder(matrix);

        assertEquals(
                List.of(
                        1, 2, 3, 4, 5,
                        10, 15, 20, 25,
                        24, 23, 22, 21,
                        16, 11, 6,
                        7, 8, 9, 14, 19,
                        18, 17, 12, 13
                ),
                result
        );
    }
}