package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesGenerationTest {

    private ParenthesesGeneration parenthesesGen;

    @BeforeEach
    void setUp() {
        parenthesesGen = new ParenthesesGeneration();
    }

    @Test
    void generateParenthesis1() {
        List<String> actual = parenthesesGen.generateParenthesis(1);

        assertEquals("()", actual.get(0));
    }

    @Test
    void generateParenthesis2() {
        List<String> actual = parenthesesGen.generateParenthesis(3);

        assertTrue(actual.contains("((()))"));
        assertTrue(actual.contains("(()())"));
        assertTrue(actual.contains("(())()"));
        assertTrue(actual.contains("()(())"));
        assertTrue(actual.contains("()()()"));
    }
}