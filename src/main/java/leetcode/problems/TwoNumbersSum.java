package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class TwoNumbersSum {

    //Runtime 11.61 % , Memory 8.16%
    //Runtime 11.61 %, Memory 83.76%
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> res = new ArrayList<>();
        int tenth = 0;
        while (!(l1 == null && l2 == null)) {
            if (l1 != null && l2 != null) {
                int sum = l1.val + l2.val + tenth;
                if (sum > 9) {
                    tenth = 1;
                    sum %= 10;
                } else {
                    tenth = 0;
                }
                res.add(new ListNode(sum, null));
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                int sum = l1.val + tenth;
                if (sum > 9) {
                    tenth = 1;
                    sum %= 10;
                } else {
                    tenth = 0;
                }
                res.add(new ListNode(sum, null));
                l1 = l1.next;
            } else {
                int sum = l2.val + tenth;
                if (sum > 9) {
                    tenth = 1;
                    sum %= 10;
                } else {
                    tenth = 0;
                }
                res.add(new ListNode(sum, null));
                l2 = l2.next;
            }
        }
        if (tenth == 1) {
            res.add(new ListNode(tenth, null));
        }
        return createListNode(res);
    }

    private ListNode createListNode(List<ListNode> res) {
        ListNode listNode = res.get(res.size() - 1);
        ListNode tempNode = listNode;
        for (int i = res.size() - 2; i >= 0; i--) {
            tempNode = res.get(i);
            tempNode.next = listNode;
            listNode = tempNode;
        }
        return tempNode;
    }

}


