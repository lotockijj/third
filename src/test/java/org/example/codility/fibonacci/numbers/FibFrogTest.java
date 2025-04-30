package org.example.codility.fibonacci.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibFrogTest {

    private FibFrog fibFrog;

    @BeforeEach
    void setUp() {
        fibFrog = new FibFrog();
    }

    @Test
    void solution() {
        int[] A = {0,0,0,1,1,0,1,0,0,0,0};

        int result = fibFrog.solution(A);

        assertEquals(3, result);
    }
}

/*
The Fibonacci sequence is defined using the following recursive formula:
    F(0) = 0
    F(1) = 1
    F(M) = F(M - 1) + F(M - 2) if M >= 2
A small frog wants to get to the other side of a river. The frog is initially located at one bank of the river (position −1) and wants to get to the other bank (position N). The frog can jump over any distance F(K), where F(K) is the K-th Fibonacci number. Luckily, there are many leaves on the river, and the frog can jump between the leaves, but only in the direction of the bank at position N.
The leaves on the river are represented in an array A consisting of N integers. Consecutive elements of array A represent consecutive positions from 0 to N − 1 on the river. Array A contains only 0s and/or 1s:
0 represents a position without a leaf;
1 represents a position containing a leaf.
The goal is to count the minimum number of jumps in which the frog can get to the other side of the river (from position −1 to position N). The frog can jump between positions −1 and N (the banks of the river) and every position containing a leaf.
For example, consider array A such that: int[] A = {0,0,0,1,1,0,1,0,0,0,0};
The frog can make three jumps of length F(5) = 5, F(3) = 2 and F(5) = 5.
Write a function: class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns the minimum number of jumps by which the frog can get to the other side of the river. If the frog cannot reach the other side of the river, the function should return −1.

For example, given: int[] A = {0,0,0,1,1,0,1,0,0,0,0};
the function should return 3, as explained above.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..100,000];
each element of array A is an integer that can have one of the following values: 0, 1.
 */