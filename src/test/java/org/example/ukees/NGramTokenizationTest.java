package org.example.ukees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NGramTokenizationTest {

    @Test
    void countDistinctNGrams1() {
        String[] tokens = {"to", "be", "or", "not", "to", "be"};

        assertEquals(4, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams2() {
        String[] tokens = {"a", "bc", "not", "ab", "c"};

        assertEquals(4, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams3() {
        String[] tokens = {"a", "a", "a", "a"};

        assertEquals(1, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams4() {
        String[] tokens = {"a", "b", "a", "b", "a"};

        assertEquals(2, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams5() {
        String[] tokens = {"one", "two", "three"};

        assertEquals(1, NGramTokenization.countDistinctNGrams(tokens, 3));
    }

    @Test
    void countDistinctNGrams6() {
        String[] tokens = {"one", "two", "three", "four"};

        assertEquals(2, NGramTokenization.countDistinctNGrams(tokens, 3));
    }

    @Test
    void countDistinctNGrams7() {
        String[] tokens = {"a", "b", "c", "d"};

        assertEquals(3, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams8() {
        String[] tokens = {"x"};

        assertEquals(1, NGramTokenization.countDistinctNGrams(tokens, 1));
    }

    @Test
    void countDistinctNGrams9() {
        String[] tokens = {"cat", "dog", "cat", "dog", "bird"};

        assertEquals(3, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams10() {
        String[] tokens = {"a", "b", "c", "a", "b", "c"};

        assertEquals(3, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams11() {
        String[] tokens = {"a", "b", "c", "a", "b", "c"};

        assertEquals(3, NGramTokenization.countDistinctNGrams(tokens, 3));
    }

    @Test
    void countDistinctNGrams12() {
        String[] tokens = {"hello", "world"};

        assertEquals(2, NGramTokenization.countDistinctNGrams(tokens, 1));
    }

    @Test
    void countDistinctNGrams13() {
        String[] tokens = {"a", "a", "b", "a", "a"};

        assertEquals(3, NGramTokenization.countDistinctNGrams(tokens, 2));
    }

    @Test
    void countDistinctNGrams14() {
        String[] tokens = {"red", "blue", "green", "yellow"};

        assertEquals(1, NGramTokenization.countDistinctNGrams(tokens, 4));
    }
}