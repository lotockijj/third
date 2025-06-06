package org.example.codility.price.and.composite.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlagsTest {

    private Flags flags;

    @BeforeEach
    void setUp() {
        flags = new Flags();
    }

    @Test
    void solution1() {
        int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};

        int result = flags.solution(A);

        assertEquals(3, result);
    }

    @Test
    void solution2() {
        int[] A = {};

        int result = flags.solution(A);

        assertEquals(0, result);
    }

    @Test
    void solution3() {
        int[] A = {1,2,3};

        int result = flags.solution(A);

        assertEquals(0, result);
    }

    @Test
    void solution4() {
        int[] A = {1,3,2};

        int result = flags.solution(A);

        assertEquals(1, result);
    }

    @Test
    void solution5() {
        int[] A = {1,2,1,3,1,1,1,1,2,1,1,4,1};

        int result = flags.solution(A);

        assertEquals(3, result);
    }

    @Test
    void solution6() {
        int[] A = {1,2,1,2,1,2,1,2,1,2,1,1,1,1,1,5,1,1,1,1,1,5,
                1,1,1,1,1,5,1,1,1,1,1,1,5,1,1,1,1,1,5,1,1,1,1,1,5,1};

        int result = flags.solution(A);

        assertEquals(5, result);
    }
}
/*
A non-empty array A consisting of N integers is given.
A peak is an array element which is larger than its neighbours. More precisely, it is an index P
such that 0 < P < N − 1 and A[P − 1] < A[P] > A[P + 1].
For example, the following array A: int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};
has exactly four peaks: elements 1, 3, 5 and 10.

You are going on a trip to a range of mountains whose relative heights are represented by array A,
as shown in a figure below. You have to choose how many flags you should take with you.
The goal is to set the maximum number of flags on the peaks, according to certain rules.
Flags can only be set on peaks. What's more, if you take K flags, then the distance between
any two flags should be greater than or equal to K. The distance between indices P and Q
is the absolute value |P − Q|.
For example, given the mountain range represented by array A, above, with N = 12, if you take:

two flags, you can set them on peaks 1 and 5;
three flags, you can set them on peaks 1, 5 and 10;
four flags, you can set only three flags, on peaks 1, 5 and 10.
You can therefore set a maximum of three flags in this case.

Write a function: class Solution { public int solution(int[] A); }
that, given a non-empty array A of N integers, returns the maximum number of flags
that can be set on the peaks of the array.
For example, the following array A: int[] A = {1,5,3,4,3,4,1,2,3,4,6,2};
the function should return 3, as explained above.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..400,000];
each element of array A is an integer within the range [0..1,000,000,000].
 */