package leetcode.two;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution0206Test {

    private Solution0206 solution0206;

    @BeforeEach
    void setUp() {
        solution0206 = new Solution0206();
    }

    @Test
    void reverseLinkedList1() {
        LinkedList<Integer> numbers = solution0206.reverseLinkedList(new LinkedList<>(List.of(1, 2, 3, 4, 5)));

        assertEquals(1, numbers.getLast());
        assertEquals(5, numbers.getFirst());
    }

    @Test
    void reverseLinkedList2() {
        LinkedList<Integer> numbers = solution0206.reverseLinkedList(new LinkedList<>(List.of(1, 2)));

        assertEquals(1, numbers.getLast());
        assertEquals(2, numbers.getFirst());
    }

    @Test
    void reverseLinkedList3() {
        LinkedList<Integer> numbers = solution0206.reverseLinkedList(new LinkedList<>());

        assertTrue(numbers.isEmpty());
    }
}

/*
206. Reverse Linked List
Easy
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:
Input: head = [1,2]
Output: [2,1]

Example 3:
Input: head = []
Output: []

Constraints:
The number of nodes in the list is the range [0, 5000].
-5000 <= Node.val <= 5000
Follow up: A linked list can be reversed either iteratively or recursively. Could you implement both?
 */
