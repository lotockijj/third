package org.example.codilitty.algorithmic.skills;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrSymmetryPointTest {

    private StrSymmetryPoint strSymmetryPoint;

    @BeforeEach
    void setUp() {
        strSymmetryPoint = new StrSymmetryPoint();
    }

    @Test
    void solution1() {
        String S = "racecar";

        int result = strSymmetryPoint.solution(S);

        assertEquals(3, result);
    }

    @Test
    void solution2() {
        String S = "x";

        int result = strSymmetryPoint.solution(S);

        assertEquals(0, result);
    }

    @Test
    void solution3() {
        String S = "ixi";

        int result = strSymmetryPoint.solution(S);

        assertEquals(1, result);
    }

    @Test
    void solution4() {
        String S = "ixi";

        int result = strSymmetryPoint.solution(S);

        assertEquals(1, result);
    }

    @Test
    void solution5() {
        String S = "aaaaaaaaaa";

        int result = strSymmetryPoint.solution(S);

        assertEquals(-1, result);
    }
}