package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWord_58Test {

    private LengthOfLastWord_58 solution;

    @BeforeEach
    void setUp() {
        solution = new LengthOfLastWord_58();
    }

    @Test
    void lengthOfLastWord1() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfLastWord2() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

    @Test
    void lengthOfLastWord3() {
        assertEquals(6, solution.lengthOfLastWord("luffy is still joyboy"));
    }
}