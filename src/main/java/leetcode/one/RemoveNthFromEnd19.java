package leetcode.one;

import leetcode.asked.ListNode;

public class RemoveNthFromEnd19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;
        ListNode temp = head;
        ListNode forRemove = null;
        ListNode before = head;
        while(temp != null) { //1,2,3,4,5 (2) and 2 or 1(1) and [] or 1,2(1) and [1] or 1,2(2) and [2]
            count++;
            if(count == n){
                forRemove = head;
            } else if(count > n){
                if(before != forRemove) {
                    before = before.next;
                }
                forRemove = forRemove.next;
            }
            temp = temp.next;
        }
        if(forRemove == head){
            before = head.next;
            head = before;
        } else {
            before.next = forRemove.next;
            forRemove.next = null;
        }
        return head;
    }
}
