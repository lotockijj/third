package org.example.codility.price.and.composite.numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinPerimeterRectangleTest {

    private MinPerimeterRectangle minPerimeterRectangle;

    @BeforeEach
    void setUp() {
        minPerimeterRectangle = new MinPerimeterRectangle();
    }

    @Test
    void solution1() {
        assertEquals(22, minPerimeterRectangle.solution(30));
    }

    @Test
    void solution2() {
        assertEquals(32, minPerimeterRectangle.solution(60));
        // 1 60 = 122
        // 2 30 = 64
        // 3 20 = 46
        // 4 15 = 38
        // 5 12 = 34
        // 6 10 = 32
    }

    @Test
    void solution3() {
        assertEquals(40, minPerimeterRectangle.solution(100));
        // 1 100 = 222
        // 2 50 = 124
        // 4 25 = 58
        // 5 20 = 50
    }

    @Test
    void solution4() {
        assertEquals(6, minPerimeterRectangle.solution(2));
        // 1 2 = 2
    }

    @Test
    void solution5() {
        assertEquals(4, minPerimeterRectangle.solution(1));
        // 1 2 = 2
    }

    @Test
    void solution6() {
        assertEquals(24, minPerimeterRectangle.solution(36));
    }

    @Test
    void solution7() {
        assertEquals(204, minPerimeterRectangle.solution(101));
    }

    @Test
    void solution8() {
        assertEquals(1238, minPerimeterRectangle.solution(1234));
    }

    @Test
    void solution9() {
        assertEquals(8, minPerimeterRectangle.solution(4));
        //1-4=10, 2-2=8;
    }
}

/*
An integer N is given, representing the area of some rectangle.
The area of a rectangle whose sides are of length A and B is A * B, and the perimeter is 2 * (A + B).
The goal is to find the minimal perimeter of any rectangle whose area equals N.
The sides of this rectangle should be only integers.
For example, given integer N = 30, rectangles of area 30 are:

(1, 30), with a perimeter of 62,
(2, 15), with a perimeter of 34,
(3, 10), with a perimeter of 26,
(5, 6), with a perimeter of 22.

Write a function: class Solution { public int solution(int N); }
that, given an integer N, returns the minimal perimeter of any rectangle whose area
is exactly equal to N.
For example, given an integer N = 30, the function should return 22, as explained above.
Write an efficient algorithm for the following assumptions:
N is an integer within the range [1..1,000,000,000].
 */