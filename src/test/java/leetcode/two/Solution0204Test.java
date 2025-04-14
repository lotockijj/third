package leetcode.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution0204Test {

    @Test
    void countPrimes1() {
        Integer i = Solution0204.countPrimes(10);
        assertEquals(4, i);
    }

    @Test
    void countPrimes2() {
        Integer i = Solution0204.countPrimes(2);
        assertEquals(0, i);
    }

    @Test
    void countPrimes3() {
        Integer i = Solution0204.countPrimes(3);
        assertEquals(0, i);
    }

    @Test
    void countPrimes4() {
        Integer i = Solution0204.countPrimes(20); // 2, 3, 5, 7, 11, 13, 17, 19
        assertEquals(8, i);
    }
}

/*
Medium
Given an integer n, return the number of prime numbers that are strictly less than n.
Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:
Input: n = 0
Output: 0
Example 3:
Input: n = 1
Output: 0

Constraints:
0 <= n <= 5 * 106
 */