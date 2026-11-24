package leetcode.one;

import leetcode.asked.ListNode;

public class Solution82 {

    /*
        Input: head = [1,2,3,3,4,4,5]
        Output: [1,2,5]
     */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        dummy.val = 0;
        ListNode previous = dummy;
        ListNode temp = dummy.next;
        while (temp != null) {
            if (temp.next != null && temp.val == temp.next.val) {
                int duplicated = temp.val;
                while (temp.next != null && temp.next.val == duplicated) {
                    temp = temp.next;
                }
                previous.next = temp.next;
                temp = previous;
            } else {
                previous = temp;
                temp = temp.next;
            }
        }
        return dummy.next;
    }
}
