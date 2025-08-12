package leetcode.problems;

import java.util.ArrayList;
import java.util.List;

public class TwoNumbersSum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<Integer> res = new ArrayList<>();
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
                res.add(sum);
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
                res.add(sum);
                l1 = l1.next;
            } else {
                int sum = l2.val + tenth;
                if (sum > 9) {
                    tenth = 1;
                    sum %= 10;
                } else {
                    tenth = 0;
                }
                res.add(sum);
                l2 = l2.next;
            }
        }
        if (tenth == 1) {
            res.add(tenth);
        }
        return createListNode(res);
    }

    private ListNode createListNode(List<Integer> res) {
        ListNode listNode = new ListNode(res.get(res.size() - 1), null);
        for (int i = res.size() - 2; i >= 0; i--) {
            listNode = new ListNode(res.get(i), listNode);
        }
        return listNode;
    }

}


