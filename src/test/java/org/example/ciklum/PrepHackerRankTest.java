package org.example.ciklum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PrepHackerRankTest {

    @Test
    void twoSum1() {
        int[] arr = {2, 7, 8, 11, 14, 25};

        int[] ints = PrepHackerRank.twoSum(arr, 9);

        assertEquals(0, ints[0]);
        assertEquals(1, ints[1]);
    }

    @Test
    void twoSum2() {
        int[] arr = {2, 7, 8, 11, 14, 25};

        int[] ints = PrepHackerRank.twoSum(arr, 22);

        assertEquals(2, ints[0]);
        assertEquals(4, ints[1]);
    }

    @Test
    void twoSum3() {
        int[] arr = {2, 7, 8, 11, 14, 25};

        int[] ints = PrepHackerRank.twoSum(arr, 27);

        assertEquals(0, ints[0]);
        assertEquals(5, ints[1]);
    }

    @Test
    void firstNonRepeating() {
        assertEquals('b', PrepHackerRank.firstNonRepeating("aba"));
        assertEquals('c', PrepHackerRank.firstNonRepeating("ababc"));
        assertEquals('c', PrepHackerRank.firstNonRepeating("cababf"));
        assertEquals('k', PrepHackerRank.firstNonRepeating("kaba"));
        assertEquals('0', PrepHackerRank.firstNonRepeating("kabakb"));
    }

    @Test
    void areAnagrams() {
        assertTrue(PrepHackerRank.areAnagrams("listen", "silent"));
        assertFalse(PrepHackerRank.areAnagrams("rat", "car"));
        assertTrue(PrepHackerRank.areAnagrams("aabb", "abab"));
    }

    @Test
    void frequencyCount() {
        Map<Character, Integer> frequencyCount = PrepHackerRank.frequencyCount("sttaaabbbb");

        assertEquals(1, frequencyCount.get('s'));
        assertEquals(2, frequencyCount.get('t'));
        assertEquals(3, frequencyCount.get('a'));
        assertEquals(4, frequencyCount.get('b'));
    }

    @Test
    void findDuplicates1() {
        List<Integer> duplicates = PrepHackerRank.findDuplicates(new int[]{1, 1, 2, 3, 4});

        assertEquals(1, duplicates.get(0));
    }

    @Test
    void findDuplicates2() {
        List<Integer> duplicates = PrepHackerRank.findDuplicates(new int[]{1, 1, 2, 3, 4, 5, 1000, 2000, 1000});

        assertEquals(1, duplicates.get(0));
        assertEquals(1000, duplicates.get(1));
    }

    @Test
    void mergeSortedArrays() {
        int[] arr1 = {1, 3, 5, 7, 9, 15, 17, 23, 55};
        int[] arr2 = {2, 4, 6, 8, 11, 12, 13, 14, 55};

        List<Integer> result = PrepHackerRank.mergeSortedArrays(arr1, arr2);

        assertEquals(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14, 15, 17, 23, 55), result);
    }

    @Test
    void validParentheses() {
        assertTrue(PrepHackerRank.validParentheses("({[]})"));
        assertFalse(PrepHackerRank.validParentheses("()("));
        assertTrue(PrepHackerRank.validParentheses("(){}"));
    }

    @Test
    void longestConsecutive1() {
        int[] arr = {100, 4, 200, 1, 3, 2};

        assertEquals(4, PrepHackerRank.longestConsecutive(arr));
    }

    @Test
    void longestConsecutive2() {
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        assertEquals(9, PrepHackerRank.longestConsecutive(arr));
    }

    @Test
    void longestConsecutive3() {
        int[] arr = {5, 5, 5};

        assertEquals(1, PrepHackerRank.longestConsecutive(arr));
    }

    @Test
    void absoluteNumber() {
        assertEquals(3, PrepHackerRank.absoluteNumber(new int[]{1, 5, 3, 4, 2}, 2));
        assertEquals(5, PrepHackerRank.absoluteNumber(new int[]{8, 12, 16, 4, 0, 20}, 4));
    }

    @Test
    void getSherlokAndArray() {
        assertEquals("YES", PrepHackerRank.getSherlokAndArray(new int[]{1, 2, 3, 3}));
        assertEquals("NO", PrepHackerRank.getSherlokAndArray(new int[]{1, 2, 3}));
        assertEquals("YES", PrepHackerRank.getSherlokAndArray(new int[]{1, 1, 4, 1, 1}));
    }

    @Test
    void minimumSwaps() {
        assertEquals(3, PrepHackerRank.minimumSwaps(new int[]{4, 3, 1, 2}));
        assertEquals(3, PrepHackerRank.minimumSwaps(new int[]{2, 3, 4, 1, 5}));
        assertEquals(0, PrepHackerRank.minimumSwaps(new int[]{1, 2, 3, 4}));
    }

    @Test
    void minimumBribes() {
        assertEquals("3", PrepHackerRank.minimumBribes(new int[]{2, 1, 5, 3, 4}));
        assertEquals("Too chaotic", PrepHackerRank.minimumBribes(new int[]{2, 5, 1, 3, 4}));
        assertEquals("0", PrepHackerRank.minimumBribes(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void sherlockAndValidString() {
        assertEquals("YES", PrepHackerRank.sherlockAndValidString("aabbcc"));
        assertEquals("YES", PrepHackerRank.sherlockAndValidString("aabbccc"));
        assertEquals("NO", PrepHackerRank.sherlockAndValidString("aabbcccc"));
        assertEquals("NO", PrepHackerRank.sherlockAndValidString("aaaabbcc"));
        assertEquals("NO", PrepHackerRank.sherlockAndValidString("aabbcd"));
        assertEquals("NO", PrepHackerRank.sherlockAndValidString("aabbccdddeee"));
        assertEquals("YES", PrepHackerRank.sherlockAndValidString("aabbccdde"));
    }

    @Test
    void checkMagazine1() {
        List<String> magazine = new ArrayList<>(List.of("give", "me", "one", "grand", "today", "night"));
        List<String> note = new ArrayList<>(List.of("give", "one", "grand", "today"));

        assertEquals("YES", PrepHackerRank.checkMagazine(magazine, note));
    }

    @Test
    void checkMagazine2() {
        List<String> magazine = new ArrayList<>(List.of("two", "times", "three", "is", "not", "four"));
        List<String> note = new ArrayList<>(List.of("two", "times", "two"));

        assertEquals("NO", PrepHackerRank.checkMagazine(magazine, note));
    }

    @Test
    void checkMagazine3() {
        List<String> magazine = new ArrayList<>(List.of("hello", "world", "hello"));
        List<String> note = new ArrayList<>(List.of("hello", "hello"));

        assertEquals("YES", PrepHackerRank.checkMagazine(magazine, note));
    }

    @Test
    void arrayManipulation1() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 2, 100));
        queries.add(List.of(2, 5, 100));
        queries.add(List.of(3, 4, 100));

        long actual = PrepHackerRank.arrayManipulation(5, queries);

        assertEquals(200, actual);
    }

    @Test
    void arrayManipulation2() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 5, 10));

        long actual = PrepHackerRank.arrayManipulation(5, queries);

        assertEquals(10, actual);
    }

    @Test
    void arrayManipulation3() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 2, 5));
        queries.add(List.of(3, 4, 7));

        long actual = PrepHackerRank.arrayManipulation(5, queries);

        assertEquals(7, actual);
    }

    @Test
    void arrayManipulation4() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(1, 3, 100));
        queries.add(List.of(1, 3, 200));

        long actual = PrepHackerRank.arrayManipulation(5, queries);

        assertEquals(300, actual);
    }

    @Test
    void arrayManipulation5() {
        List<List<Integer>> queries = new ArrayList<>();
        queries.add(List.of(2, 4, 50));
        queries.add(List.of(3, 5, 30));

        long actual = PrepHackerRank.arrayManipulation(5, queries);

        assertEquals(80, actual);
    }

    @Test
    void countingValleys(){
        assertEquals(1, PrepHackerRank.countingValleys("DDUU"));
        assertEquals(0, PrepHackerRank.countingValleys("UDUD"));
        assertEquals(2, PrepHackerRank.countingValleys("DDUUDDUU"));
        assertEquals(0, PrepHackerRank.countingValleys("UUUDDD"));
        assertEquals(2, PrepHackerRank.countingValleys("DUDU"));
    }
}