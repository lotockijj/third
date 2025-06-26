package org.example.codilitty.contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SocksLaunderingTest {

    private SocksLaundering socksLaundering;

    @BeforeEach
    void setUp() {
        socksLaundering = new SocksLaundering();
    }

    @Test
    void solution1() {
        int[] clean = {1,2,1,1};
        int[] dirty = {1,4,3,2,4};

        int result = socksLaundering.solution(2, clean, dirty);

        assertEquals(3, result);
    }

    @Test
    void solution2() {
        int[] clean = {1,2,1,1};
        int[] dirty = {1,4,3,2,4,6,6};

        int result = socksLaundering.solution(4, clean, dirty);

        assertEquals(4, result);
    }

    /*
    tests causing solution that's only pairing clean socks of odd count
    with dirty socks of odd count to fail
     */
    @Test
    void solution3() {
        int[] clean = {5,5,5,3,3,3,1,1,1};
        int[] dirty = {1,5,3,5};

        int result = socksLaundering.solution(2, clean, dirty);

        assertEquals(5, result);
    }

    @Test
    void solution4() {
        int[] clean = {1,2,3};
        int[] dirty = {1,2,3};

        int result = socksLaundering.solution(2, clean, dirty);

        assertEquals(2, result);
    }
}