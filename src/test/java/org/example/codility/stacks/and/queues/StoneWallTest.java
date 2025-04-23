package org.example.codility.stacks.and.queues;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoneWallTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void solution() {
    }
}

/*
You are going to build a stone wall. The wall should be straight and N meters long,
and its thickness should be constant; however, it should have different heights in different places.
The height of the wall is specified by an array H of N positive integers.
H[I] is the height of the wall from I to I+1 meters to the right of its left end.
In particular, H[0] is the height of the wall's left end and H[N−1] is the height of the wall's right end.
The wall should be built of cuboid stone blocks (that is, all sides of such blocks are rectangular).
Your task is to compute the minimum number of blocks needed to build the wall.

Write a function:class Solution { public int solution(int[] H); }
that, given an array H of N positive integers specifying the height of the wall,
returns the minimum number of blocks needed to build it.
For example, given array H containing N = 9 integers: new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}
the function should return 7. The figure shows one possible arrangement of seven blocks.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..100,000];
each element of array H is an integer within the range [1..1,000,000,000].
 */