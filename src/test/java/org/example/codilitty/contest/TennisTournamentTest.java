package org.example.codilitty.contest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TennisTournamentTest {

    private TennisTournament tournament;

    @BeforeEach
    void setUp() {
        tournament = new TennisTournament();
    }

    @Test
    void solution1() {
        int result = tournament.solution(5, 3);

        assertEquals(2, result);
    }

    @Test
    void solution2() {
        int result = tournament.solution(10, 3);

        assertEquals(3, result);
    }

    @Test
    void solution3() {
        int result = tournament.solution(10, 5);

        assertEquals(5, result);
    }
}