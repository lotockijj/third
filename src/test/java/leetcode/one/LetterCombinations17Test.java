package leetcode.one;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinations17Test {

    private LetterCombinations17 letterComb;

    @BeforeEach
    void setUp() {
        letterComb = new LetterCombinations17();
    }

    @Test
    void letterCombinations1() {
        List<String> actual = letterComb.letterCombinations("23");

        assertTrue(actual.containsAll(List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }

    @Test
    void letterCombinations2() {
        List<String> actual = letterComb.letterCombinations("");

        assertEquals(0, actual.size());
    }

    @Test
    void letterCombinations3() {
        List<String> actual = letterComb.letterCombinations("2");

        assertTrue(actual.containsAll(List.of("a", "b", "c")));
    }

    @Test
    void letterCombinations4() {
        List<String> actual = letterComb.letterCombinations("234");

        assertTrue(actual.containsAll(List.of("adg","adh","adi","aeg","aeh","aei","afg","afh","afi","bdg","bdh","bdi","beg","beh","bei","bfg","bfh","bfi","cdg","cdh","cdi","ceg","ceh","cei","cfg","cfh","cfi")));
    }

    @Test
    void letterCombinations5() {
        List<String> actual = letterComb.letterCombinations("5678");

        assertTrue(actual.containsAll(List.of("jmpt","jmpu","jmpv","jmqt","jmqu","jmqv","jmrt","jmru","jmrv","jmst","jmsu","jmsv","jnpt","jnpu","jnpv","jnqt","jnqu","jnqv","jnrt","jnru","jnrv","jnst","jnsu","jnsv","jopt","jopu","jopv","joqt","joqu","joqv","jort","joru","jorv","jost","josu","josv","kmpt","kmpu","kmpv","kmqt","kmqu","kmqv","kmrt","kmru","kmrv","kmst","kmsu","kmsv","knpt","knpu","knpv","knqt","knqu","knqv","knrt","knru","knrv","knst","knsu","knsv","kopt","kopu","kopv","koqt","koqu","koqv","kort","koru","korv","kost","kosu","kosv","lmpt","lmpu","lmpv","lmqt","lmqu","lmqv","lmrt","lmru","lmrv","lmst","lmsu","lmsv","lnpt","lnpu","lnpv","lnqt","lnqu","lnqv","lnrt","lnru","lnrv","lnst","lnsu","lnsv","lopt","lopu","lopv","loqt","loqu","loqv","lort","loru","lorv","lost","losu","losv")));
    }
}