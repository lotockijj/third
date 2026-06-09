package org.example.tuning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ColoursTest {

    private Colours colours;

    @BeforeEach
    void setUp() {
        colours = new Colours();
    }

    @Test
    void getColourResult1() {
        String str = "green2 black1 red3";

        String colourResult = colours.getColourResult(str);

        assertEquals("black green red", colourResult);
    }

    @Test
    void getColourResult2() {
        String str = "orange4 yellow5 green2 black1 red3";

        String colourResult = colours.getColourResult(str);

        assertEquals("black green red orange yellow", colourResult);
    }
}