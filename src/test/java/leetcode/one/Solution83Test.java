package leetcode.one;

import leetcode.asked.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution83Test {

    private  Solution83 unit;

    @BeforeEach
    void setUp() {
        unit = new Solution83();
    }

    @Test
    void deleteDuplicates1() {
        ListNode head = ListNode.getListOfNodes(2, 1, 1);

        assertListEquals(new int[]{1, 2}, unit.deleteDuplicates(head));
    }

    @Test
    void deleteDuplicates2() {
        ListNode head = ListNode.getListOfNodes(3, 3, 2, 1, 1);

        assertListEquals(new int[]{1, 2, 3}, unit.deleteDuplicates(head));
    }

    private void assertListEquals(int[] expected, ListNode actual) {
        int index = 0;

        while (actual != null) {
            assertTrue(index < expected.length, "Returned list contains too many elements");
            assertEquals(expected[index], actual.val);
            actual = actual.next;
            index++;
        }
        assertEquals(expected.length, index, "Returned list contains too few elements");
    }
}