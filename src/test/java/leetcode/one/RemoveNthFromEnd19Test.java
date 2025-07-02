package leetcode.one;

import leetcode.asked.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEnd19Test {

    private RemoveNthFromEnd19 removeNth;

    @BeforeEach
    void setUp() {
        removeNth = new RemoveNthFromEnd19();
    }

    @Test
    void removeNthFromEnd1() {
        ListNode listNode = ListNode.getListOfNodes(5, 4, 3, 2, 1);

        ListNode actualNod = removeNth.removeNthFromEnd(listNode, 2);

        assertEquals(5, actualNod.next.next.next.val);
    }

    @Test
    void removeNthFromEnd2() {
        ListNode listNode = ListNode.getListOfNodes(1);

        ListNode actualNod = removeNth.removeNthFromEnd(listNode, 1);

        assertNull(actualNod);
    }

    @Test
    void removeNthFromEnd3() {
        ListNode listNode = ListNode.getListOfNodes(2, 1);

        ListNode actualNod = removeNth.removeNthFromEnd(listNode, 1);

        assertNull(actualNod.next);
        assertEquals(1, actualNod.val);
    }

    @Test
    void removeNthFromEnd4() {
        ListNode listNode = ListNode.getListOfNodes(2, 1);

        ListNode actualNod = removeNth.removeNthFromEnd(listNode, 2);

        assertEquals(2, actualNod.val);
    }
}