package org.example.codilitty.coding.skills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThreeLettersTest {
    private static final int NUMBER_OF_REPEATS = 10;

    private ThreeLetters threeLetters;

    @BeforeEach
    void setUp() {
        threeLetters = new ThreeLetters();
    }

    @Test
    void solution1() {
        int A = 3;
        int B = 5;

        for (int i = 0; i < NUMBER_OF_REPEATS; i++) {

            String solution = threeLetters.solution(A, B);

            assertFalse(solution.contains("aaa"));
            assertFalse(solution.contains("bbb"));
            assertTrue(containsRightNumberOfLetters(solution, A, B));
        }
    }

    @Test
    void solution2() {
        int A = 3;
        int B = 3;

        for (int i = 0; i < NUMBER_OF_REPEATS; i++) {

            String solution = threeLetters.solution(A, B);

            assertFalse(solution.contains("aaa"));
            assertFalse(solution.contains("bbb"));
            assertTrue(containsRightNumberOfLetters(solution, A, B));
        }
    }

    @Test
    void solution3() {
        int A = 1;
        int B = 4;

        for (int i = 0; i < NUMBER_OF_REPEATS; i++) {

            String solution = threeLetters.solution(A, B);

            assertFalse(solution.contains("aaa"));
            assertFalse(solution.contains("bbb"));
            assertTrue(containsRightNumberOfLetters(solution, A, B));
        }
    }

    private boolean containsRightNumberOfLetters(String solution, int aNumber, int bNumber) {
        for (int i = 0; i < solution.length(); i++) {
            if(solution.charAt(i) == 'a'){
                aNumber--;
            } else {
                bNumber--;
            }
        }
        return aNumber == 0 && bNumber == 0;
    }
}