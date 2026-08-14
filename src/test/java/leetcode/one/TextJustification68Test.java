package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextJustification68Test {

    private TextJustification68 unit;

    @BeforeEach
    void setUp() {
        unit = new TextJustification68();
    }

    @Test
    void fullJustify1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};

        List<String> strings = unit.fullJustify(words, 16);

        assertEquals(3, strings.size());
        assertTrue(strings.contains("This    is    an"));
        assertTrue(strings.contains("example  of text"));
        assertTrue(strings.contains("justification.  "));
    }

    @Test
    void fullJustify2() {
        String[] words = {"What","must","be","acknowledgment","shall","be"};

        List<String> strings = unit.fullJustify(words, 16);

        assertEquals(3, strings.size());
        assertTrue(strings.contains("What   must   be"));
        assertTrue(strings.contains("acknowledgment  "));
        assertTrue(strings.contains("shall be        "));
    }

    @Test
    void fullJustify3() {
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};

        List<String> strings = unit.fullJustify(words, 20);

        assertEquals(6, strings.size());
        assertTrue(strings.contains("Science  is  what we"));
        assertTrue(strings.contains("understand      well"));
        assertTrue(strings.contains("enough to explain to"));
        assertTrue(strings.contains("a  computer.  Art is"));
        assertTrue(strings.contains("everything  else  we"));
        assertTrue(strings.contains("do                  "));
    }

    @Test //Wrong Answer 23 / 29 testcases passed
    void fullJustify4() {
        String[] words = {"Listen","to","many,","speak","to","a","few."};

        List<String> strings = unit.fullJustify(words, 6);

        assertEquals(6, strings.size());
        assertTrue(strings.contains("Listen"));
        assertTrue(strings.contains("to    "));
        assertTrue(strings.contains("many, "));
        assertTrue(strings.contains("speak "));
        assertTrue(strings.contains("to   a"));
        assertTrue(strings.contains("few.  "));
    }
}