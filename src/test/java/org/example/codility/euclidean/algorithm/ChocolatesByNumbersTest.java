package org.example.codility.euclidean.algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ChocolatesByNumbersTest {

    private ChocolatesByNumbers chocolatesByNumbers;

    @BeforeEach
    void setUp() {
        chocolatesByNumbers = new ChocolatesByNumbers();
    }

    @Test
    void solution1() {
        int result = chocolatesByNumbers.solution(10, 4);

        assertEquals(5, result);
    }

    @Test
    void solution2() {
        int result = chocolatesByNumbers.solution(12, 4);

        assertEquals(3, result);
    }

    @Test
    void solution3() {
        int result = chocolatesByNumbers.solution(67, 17);

        assertEquals(36, result);
    }

    @Test
    void solution4() {
        int result = chocolatesByNumbers.solution(24, 18);

        assertEquals(4, result);
    }

    @Test
    void solution5() {
        int result = chocolatesByNumbers.solution(3, 2);

        assertEquals(3, result);
    }

    @Test
    void solution6() {
        int result = chocolatesByNumbers.solution(4, 3);

        assertEquals(4, result);
    }

    @Test
    void solution7() {
        int result = chocolatesByNumbers.solution(1, 3);

        assertEquals(1, result);
    }

    @Test //0.000332326 seconds !
    void solution8() {
        long startTime = System.nanoTime();

        int result = chocolatesByNumbers.solution(Integer.MAX_VALUE, 101);

        System.out.println(System.nanoTime() - startTime);

        assertEquals(21262348, result);
    }
}

/*
Two positive integers N and M are given. Integer N represents the number of chocolates arranged in a circle, numbered from 0 to N − 1.
You start to eat the chocolates. After eating a chocolate you leave only a wrapper.
You begin with eating chocolate number 0. Then you omit the next M − 1 chocolates or wrappers on the circle, and eat the following one.
More precisely, if you ate chocolate number X, then you will next eat the chocolate with number (X + M) modulo N (remainder of division).
You stop eating when you encounter an empty wrapper.
For example, given integers N = 10 and M = 4. You will eat the following chocolates: 0, 4, 8, 2, 6.
The goal is to count the number of chocolates that you will eat, following the above rules.
Write a function: class Solution { public int solution(int N, int M); }
that, given two positive integers N and M, returns the number of chocolates that you will eat.
For example, given integers N = 10 and M = 4. the function should return 5, as explained above.
Write an efficient algorithm for the following assumptions:
N and M are integers within the range [1..1,000,000,000].
 */