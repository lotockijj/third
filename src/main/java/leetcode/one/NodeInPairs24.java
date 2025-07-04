package leetcode.one;

import leetcode.asked.ListNode;

/*
Given a linked list, swap every two adjacent nodes and return its head.
You must solve the problem without modifying the values in the list's nodes
(i.e., only nodes themselves may be changed.)
[1,2,3,4] :=>
[2,1,4,3]
 */
public class NodeInPairs24 {

    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode second = head.next;
        ListNode secondNext = second.next;
        second.next = head;
        head.next = secondNext;
        ListNode temp = head.next;
        ListNode previous = head;
        head = second;
        boolean needSwap = true;
        while (temp != null) {
            if (needSwap) {
                ListNode tempNext = temp.next;
                if(tempNext == null){
                    break;
                }
                ListNode tempNextNext = tempNext.next;
                previous.next = tempNext;
                tempNext.next = temp;
                temp.next = tempNextNext;
                needSwap = false;
            } else {
                previous = temp;
                temp = temp.next;
                needSwap = true;
            }
        }
        return head;
    }
}
