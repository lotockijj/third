package leetcode.two;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution0203Test {

    @Test
    void removeLinkedListElements1() {
        LinkedList<Integer> numbers = new LinkedList<>(List.of(1,2,6,3,4,5,6));
        Solution0203.removeLinkedListElements(numbers, 6);
        assertFalse(numbers.contains(6));
        assertTrue(numbers.contains(1));
        assertTrue(numbers.contains(2));
        assertTrue(numbers.contains(3));
        assertTrue(numbers.contains(4));
        assertTrue(numbers.contains(5));
    }

    @Test
    void removeLinkedListElements2() {
        LinkedList<Integer> numbers = new LinkedList<>();
        Solution0203.removeLinkedListElements(numbers, 1);
        assertFalse(numbers.contains(1));
    }

    @Test
    void removeLinkedListElements3() {
        int value = 7;
        LinkedList<Integer> numbers = new LinkedList<>(List.of(value,value,value,value));
        Solution0203.removeLinkedListElements(numbers, value);
        assertFalse(numbers.contains(value));
    }
}