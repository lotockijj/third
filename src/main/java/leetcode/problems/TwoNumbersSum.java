package leetcode.problems;

import java.util.Arrays;

public class TwoNumbersSum {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder res = new StringBuilder();
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
                res.append(sum);
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
                res.append(sum);
                l1 = l1.next;
            } else {
                int sum = l2.val + tenth;
                if (sum > 9) {
                    tenth = 1;
                    sum %= 10;
                } else {
                    tenth = 0;
                }
                res.append(sum);
                l2 = l2.next;
            }
        }
        if (tenth == 1) {
            res.append(tenth);
        }
        int[] numbers = Arrays.stream(res.toString().split(""))
                .mapToInt(Integer::parseInt).toArray();
        return createListNode(numbers);
    }

    private ListNode createListNode(int... arr) {
        ListNode listNode = new ListNode(arr[arr.length - 1], null);
        for (int i = arr.length - 2; i >= 0; i--) {
            listNode = new ListNode(arr[i], listNode);
        }
        return listNode;
    }

}


