package org.example.codility.leader;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DominatorTest {

    private Dominator dominator;

    @BeforeEach
    void setUp() {
        dominator = new Dominator();
    }

    @Test
    void solution1() {
        int[] A = new int[]{3, 2, 3, 4, 3, 3, 3, -1};

        int result = dominator.solution(A);

        assertEquals(0, result);
    }

    @Test
    void solution2() {
        int[] A = new int[]{3, 4, 3, 2, 3, -1, 3, 3};

        int result = dominator.solution(A);

        assertEquals(0, result);
    }

    @Test
    void solution3() {
        int[] A = new int[]{1, 4, 3, 2, 3, -1, 3, 3};

        int result = dominator.solution(A);

        assertEquals(-1, result);
    }

    @Test
    void solution4() {
        int[] A = new int[]{1, 2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3};

        int result = dominator.solution(A);

        assertEquals(-1, result);
    }

    @Test
    void solution5() {
        int[] A = new int[]{2,2,2,2,3,3,3,3,3};

        int result = dominator.solution(A);

        assertEquals(4, result);
    }

    @Test
    void solution6() {
        int[] A = new int[]{2,2,1,3,3,3,4,4,4,4};

        int result = dominator.solution(A);

        assertEquals(-1, result);
    }

    @Test
    void solution7() {
        int[] A = new int[]{2};

        int result = dominator.solution(A);

        assertEquals(0, result);
    }
}

/*
An array A consisting of N integers is given. The dominator of array A is the value
that occurs in more than half of the elements of A.

For example, consider array A such that

new int[]{3, 2, 3, 4, 3, 3, 3, -1}
The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.

Write a function class Solution { public int solution(int[] A); }
that, given an array A consisting of N integers, returns index of any element of array A
in which the dominator of A occurs. The function should return −1 if array A
does not have a dominator.

For example, given array A such that
new int[]{3, 2, 3, 4, 3, 3, 3, -1}
the function may return 0, 2, 4, 6 or 7, as explained above.

Write an efficient algorithm for the following assumptions:
N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
 */