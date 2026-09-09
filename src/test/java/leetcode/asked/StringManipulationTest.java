package leetcode.asked;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringManipulationTest {

    private StringManipulation stringManipulation;

    @BeforeEach
    void setUp() {
        stringManipulation = new StringManipulation();
    }

    @Test
    void reverseWordsOrder() {
        String sentence = "Hello world from Java";
        String expected = "Java from world Hello";

        String actual = stringManipulation.reverseWordsOrder(sentence);

        assertEquals(expected, actual);
    }
}