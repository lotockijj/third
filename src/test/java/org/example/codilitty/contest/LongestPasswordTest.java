package org.example.codilitty.contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPasswordTest {

    private LongestPassword longestPassword;

    @BeforeEach
    void setUp() {
        longestPassword = new LongestPassword();
    }

    @Test
    void solution1() {
        int result = longestPassword.solution("test 5 a0A pass007 ?xy1");

        assertEquals(7, result);
    }

    @Test
    void solution2() {
        int result = longestPassword.solution("test");

        assertEquals(-1, result);
    }
}