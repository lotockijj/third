package leetcode.asked;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DuplicateFinderTest {

    private DuplicateFinder duplicateFinder;

    @BeforeEach
    void setUp() {
        duplicateFinder = new DuplicateFinder();
    }

    @Test
    void findDuplicate1() {
        int[] nums = {1, 2, 3, 1};

        List<Integer> duplicate = duplicateFinder.findDuplicate(nums);

        assertTrue(duplicate.contains(1));
        assertFalse(duplicate.contains(2));
    }

    @Test
    void findDuplicate2() {
        int[] nums = {1, 2, 3, 2};

        List<Integer> duplicate = duplicateFinder.findDuplicate(nums);

        assertTrue(duplicate.contains(2));
        assertFalse(duplicate.contains(1));
    }

    @Test
    void findDuplicate3() {
        int[] nums = {1, 1, 1, 2, 3};

        List<Integer> duplicate = duplicateFinder.findDuplicate(nums);

        assertTrue(duplicate.contains(1));
        assertEquals(1, duplicate.size());
    }

    @Test
    void findFirstNonDuplicateChar1(){
        char expected = duplicateFinder.findFirstNonDuplicateChar("abcc");

        assertEquals('a', expected);
    }

    @Test
    void findFirstNonDuplicateChar2(){
        char expected = duplicateFinder.findFirstNonDuplicateChar("aabcc");

        assertEquals('b', expected);
    }

    @Test
    void findFirstNonDuplicateChar3(){
        char expected = duplicateFinder.findFirstNonDuplicateChar("aabbcc");

        assertEquals(' ', expected);
    }

    @Test
    void findFirstNonDuplicateChar4(){
        char expected = duplicateFinder.findFirstNonDuplicateChar("aabblcc");

        assertEquals('l', expected);
    }

}