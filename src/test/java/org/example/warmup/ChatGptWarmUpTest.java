package org.example.warmup;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ChatGptWarmUpTest {

    private ChatGptWarmUp solution;

    @BeforeEach
    void setUp() {
        solution = new ChatGptWarmUp();
    }

    @Test
    void findNotingCharacters1() {
        assertEquals("w", solution.findFirstNotRepeatedCharacters("swiss"));
    }

    @Test
    void findNotingCharacters2() {
        assertEquals("a", solution.findFirstNotRepeatedCharacters("abc"));
    }

    @Test
    void findNotingCharacters3() {
        assertEquals("c", solution.findFirstNotRepeatedCharacters("abcba"));
    }

    @Test
    void groupAnagrams1() {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> lists = solution.groupAnagrams(strings);

        assertEquals(3, lists.size());
        assertTrue(lists.get(0).contains("eat"));
        assertTrue(lists.get(0).contains("tea"));
        assertTrue(lists.get(0).contains("ate"));

        assertTrue(lists.get(1).contains("tan"));
        assertTrue(lists.get(1).contains("nat"));

        assertTrue(lists.get(2).contains("bat"));
    }

    @Test
    void twoSum1() {
        int[] arr = {2, 7, 11, 15};

        int[] result = solution.twoSum(arr, 9);

        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    void twoSum2() {
        int[] arr = {2, 7, 11, 15, 1001};

        int[] result = solution.twoSum(arr, 1003);

        assertEquals(0, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    void twoSum3() {
        int[] arr = {2, 7, 11, 15, 16, 1001, 10001, 1000001};

        int[] result = solution.twoSum(arr, 31);

        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    void findDuplicate1() {
        int[] arr = {1, 3, 4, 2, 2};

        assertEquals(2, solution.findDuplicate(arr));
    }

    @Test
    void findDuplicate2() {
        int[] arr = {1, 3, 10001, 4, 2, 5, 10001};

        assertEquals(10001, solution.findDuplicate(arr));
    }
}