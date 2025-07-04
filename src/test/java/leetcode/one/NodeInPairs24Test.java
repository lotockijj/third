package leetcode.one;

import leetcode.asked.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeInPairs24Test {

    private NodeInPairs24 inPairs24;

    @BeforeEach
    void setUp() {
        inPairs24 = new NodeInPairs24();
    }

    @Test
    void swapPairs1() {
        ListNode listOfNodes = ListNode.getListOfNodes(4, 3, 2, 1);

        ListNode listNode = inPairs24.swapPairs(listOfNodes);

        assertEquals(2, listNode.val);
        assertEquals(1, listNode.next.val);
        assertEquals(4, listNode.next.next.val);
        assertEquals(3, listNode.next.next.next.val);
    }

    @Test
    void swapPairs2() {
        ListNode listOfNodes = ListNode.getListOfNodes();

        ListNode listNode = inPairs24.swapPairs(listOfNodes);

        assertEquals(listOfNodes, listNode);
    }

    @Test
    void swapPairs3() {
        ListNode listOfNodes = ListNode.getListOfNodes(1);

        ListNode listNode = inPairs24.swapPairs(listOfNodes);

        assertEquals(listOfNodes, listNode);
    }

    @Test
    void swapPairs4() {
        ListNode listOfNodes = ListNode.getListOfNodes(3, 2, 1);

        ListNode listNode = inPairs24.swapPairs(listOfNodes);

        assertEquals(2, listNode.val);
        assertEquals(1, listNode.next.val);
        assertEquals(3, listNode.next.next.val);
    }
}