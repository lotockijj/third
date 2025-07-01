package leetcode.asked;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoListToOneTest {

    private TwoListToOne twoListToOne;

    @BeforeEach
    void setUp() {
        twoListToOne = new TwoListToOne();
    }

    @Test
    void mergeTwoLists1() {
        ListNode listNode1 = getListOfNodes(4, 2, 1);
        ListNode listNode2 = getListOfNodes(4, 3, 1);

        ListNode actual = twoListToOne.mergeTwoLists(listNode1, listNode2);

        assertEquals(1, actual.val);
        assertEquals(1, actual.next.val);
        assertEquals(2, actual.next.next.val);
        assertEquals(3, actual.next.next.next.val);
        assertEquals(4, actual.next.next.next.next.val);
        assertEquals(4, actual.next.next.next.next.next.val);
    }

    @Test
    void mergeTwoLists2() {
        ListNode listNode1 = getListOfNodes();
        ListNode listNode2 = getListOfNodes();

        ListNode actual = twoListToOne.mergeTwoLists(listNode1, listNode2);

        assertEquals(0, actual.val);
    }

    private ListNode getListOfNodes(int... i) {
        if(i.length == 0) return new ListNode();
        ListNode listNode = new ListNode(i[0]);
        for (int j = 1; j < i.length; j++) {
            ListNode listNext = new ListNode();
            listNext.val = i[j];
            listNext.next = listNode;
            listNode = listNext;
        }
        return listNode;
    }
}