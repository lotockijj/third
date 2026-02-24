package leetcode.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoNumbersSumTest {

    private TwoNumbersSum twoNumbersSum;

    @BeforeEach
    void setUp() {
        twoNumbersSum = new TwoNumbersSum();
    }

    @Test
    void addTwoNumbers1() {
        ListNode firstListNode = createListNode(3, 4, 2);
        ListNode secondListNode = createListNode(4, 6, 5);

        ListNode actual = twoNumbersSum.addTwoNumbers(firstListNode, secondListNode);

        ListNode expected = createListNode(8, 0, 7);

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.next.val, actual.next.next.val);
    }

    @Test
    void addTwoNumbers2() {
        ListNode firstListNode = createListNode(0);
        ListNode secondListNode = createListNode(0);

        ListNode actual = twoNumbersSum.addTwoNumbers(firstListNode, secondListNode);

        ListNode expected = createListNode(0);

        assertEquals(expected.val, actual.val);
    }

    @Test
    void addTwoNumbers3() {
        ListNode firstListNode = createListNode(9, 9, 9, 9, 9, 9, 9);
        ListNode secondListNode = createListNode(9, 9, 9, 9);

        ListNode actual = twoNumbersSum.addTwoNumbers(firstListNode, secondListNode);

        ListNode expected = createListNode(1, 0, 0, 0, 9, 9, 9, 8);

        assertEquals(expected.val, actual.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.val, actual.next.val);
        assertEquals(expected.next.val, actual.next.val);
    }

    private ListNode createListNode(int... arr) {
        ListNode listNode = new ListNode(arr[0], null);
        for (int i = 1; i < arr.length; i++) {
            listNode = new ListNode(arr[i], listNode);
        }
        return listNode;
    }
}