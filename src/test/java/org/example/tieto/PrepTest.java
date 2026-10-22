package org.example.tieto;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrepTest {

    @Test
    void firstNotRepeatingChar1() {
        assertEquals('s', Prep.firstNotRepeatingChar("smnmn"));
        assertEquals('k', Prep.firstNotRepeatingChar("aka"));
        assertEquals('r', Prep.firstNotRepeatingChar("akakbbmstrmst"));
    }

    @Test
    void isValidParentheses1() {
        assertTrue(Prep.isValidParentheses("()"));
        assertTrue(Prep.isValidParentheses("[()]"));
        assertTrue(Prep.isValidParentheses("{()}{}"));
        assertTrue(Prep.isValidParentheses("(){}[]"));
        assertFalse(Prep.isValidParentheses("(){}["));
        assertFalse(Prep.isValidParentheses("(){}["));
        assertFalse(Prep.isValidParentheses(")"));
    }

    @Test
    void mergeTwoSortedArrays1() {
        int[] arr1 = {1, 7, 100, 1001};
        int[] arr2 = {2, 5, 99, 1000};

        List<Integer> result = Prep.mergeTwoSortedArrays(arr1, arr2);

        assertEquals(Arrays.asList(1, 2, 5, 7, 99, 100, 1000, 1001), result);
    }

    @Test
    void mergeTwoSortedArrays2() {
        int[] arr1 = {1, 7, 100, 1001};
        int[] arr2 = {};

        List<Integer> result = Prep.mergeTwoSortedArrays(arr1, arr2);

        assertEquals(Arrays.asList(1, 7, 100, 1001), result);
    }

    @Test
    void mergeTwoSortedArrays3() {
        int[] arr1 = {};
        int[] arr2 = {};

        List<Integer> result = Prep.mergeTwoSortedArrays(arr1, arr2);

        assertTrue(result.isEmpty());
    }

    @Test
    void mergeTwoSortedArrays4() {
        int[] arr1 = {1, 2, 4, 7};
        int[] arr2 = {8, 9, 10, 11};

        List<Integer> result = Prep.mergeTwoSortedArrays(arr1, arr2);

        assertEquals(Arrays.asList(1, 2, 4, 7, 8, 9, 10, 11), result);
    }

    @Test
    void longestSubstringWithoutRepeatingChar(){
        assertEquals("smn", Prep.longestSubstringWithoutRepeatingChar("ssmnn"));
        assertEquals("a", Prep.longestSubstringWithoutRepeatingChar("aaaa"));
        assertEquals("vafirstj", Prep.longestSubstringWithoutRepeatingChar("javafirstjava"));
    }

    @Test
    void groupAnagrams1(){
        String[] arr = {"abc","bca","cab","xyz","zyx"};

        List<List<String>> actual = Prep.groupAnagrams(arr);

        assertEquals(2, actual.size());
    }

    @Test
    void groupAnagrams2(){
        String[] arr = {"a"};

        List<List<String>> actual = Prep.groupAnagrams(arr);

        assertEquals("a", actual.get(0).get(0));
    }
}