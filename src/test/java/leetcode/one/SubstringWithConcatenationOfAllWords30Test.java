package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static leetcode.one.constants.LeetcodeConstants.ARRAY_OF_LONG_WORDS;
import static leetcode.one.constants.LeetcodeConstants.LONG_WORD;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SubstringWithConcatenationOfAllWords30Test {

    private SubstringWithConcatenationOfAllWords30 allWords30;

    @BeforeEach
    void setUp() {
        allWords30 = new SubstringWithConcatenationOfAllWords30();
    }

    @Test
    void findSubstring1() {
        String[] words = {"foo", "bar"};

        List<Integer> actual = allWords30.findSubstring("barfoothefoobarman", words);

        assertEquals(List.of(0, 9), actual);
    }

    @Test
    void findSubstring2() {
        String[] words = {"word", "good", "best", "word"};

        List<Integer> actual = allWords30.findSubstring("wordgoodgoodgoodbestword", words);

        assertEquals(List.of(), actual);
    }

    @Test
    void findSubstring3() {
        String[] words = {"bar", "foo", "the"};

        List<Integer> actual = allWords30.findSubstring("barfoofoobarthefoobarman", words);

        assertEquals(List.of(6, 9, 12), actual);
    }

    @Test
    void findSubstring4() {
        String[] words = {"fooo", "barr", "wing", "ding", "wing"};

        List<Integer> actual = allWords30.findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", words);

        assertEquals(List.of(13), actual);
    }

    @Test
    void findSubstring5() { //957262, 1126627
        long start = System.nanoTime();

        List<Integer> actual = allWords30.findSubstring(LONG_WORD, ARRAY_OF_LONG_WORDS);

        long actualTimeExecution = TimeUnit.MILLISECONDS.toSeconds((System.nanoTime() - start));

        assertEquals(4999, actual.size());
        assertTrue(actualTimeExecution < 100_000);
    }

    @Test
    void findSubstring6() {
        String[] words = {"a", "a"};

        List<Integer> actual = allWords30.findSubstring("aaa", words);

        assertEquals(List.of(0, 1), actual);
    }
}