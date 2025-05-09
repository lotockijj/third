package org.example.codilitty;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstUniqueTest {

    private FirstUnique firstUnique;

    @BeforeEach
    void setUp() {
        firstUnique = new FirstUnique();
    }

    @Test
    void solution1() {
        int[] a = {4,10,5,4,2,10};

        int result = firstUnique.solution(a);

        assertEquals(5, result);
    }

    @Test
    void solution2() {
        int[] a = {1,4,3,3,1,2};

        int result = firstUnique.solution(a);

        assertEquals(4, result);
    }

    @Test
    void solution3() {
        int[] a = {6,4,4,6};

        int result = firstUnique.solution(a);

        assertEquals(-1, result);
    }

    @Test
    void solution4() {
        int[] a = {1,2,2,2,1,1};

        int result = firstUnique.solution(a);

        assertEquals(1, result);
    }
}