package leetcode.one;

import leetcode.asked.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class KSortedListsTest {

    private KSortedLists kSortedLists;

    @BeforeEach
    void setUp() {
        kSortedLists = new KSortedLists();
    }

    @Test
    void mergeKLists1() {
        ListNode listOfNodes1 = ListNode.getListOfNodes(5, 4, 1);
        ListNode listOfNodes2 = ListNode.getListOfNodes(4, 3, 1);
        ListNode listOfNodes3 = ListNode.getListOfNodes(6, 2);
        ListNode[] listsOfNodes = {listOfNodes1, listOfNodes2, listOfNodes3};

        ListNode expectedListOfNodes = ListNode.getListOfNodes(6, 5, 4, 4, 3, 2, 1, 1);

        ListNode actual = kSortedLists.mergeKLists(listsOfNodes);

        assertEquals(expectedListOfNodes.val, actual.val);
    }

    @Test
    void mergeKLists2() {
        ListNode[] listsOfNodes = {};

        ListNode actual = kSortedLists.mergeKLists(listsOfNodes);

        assertNull(actual);
    }
}