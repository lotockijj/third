package leetcode.one;


import leetcode.asked.ListNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution61 {

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        Deque<ListNode> nodes = new ArrayDeque<>();
        List<ListNode> all = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            all.add(temp);
            temp = temp.next;
        }
        int len = k >= all.size() ? k % all.size() : k;
        if (len == 0) {
            return head;
        }
        temp = head;
        ListNode end = null;
        while (temp != null) {
            nodes.addFirst(temp);
            temp = temp.next;
            if (nodes.size() == len + 1) {
                end = nodes.removeLast();
            }
        }
        ListNode first = nodes.getLast();
        ListNode last = nodes.getFirst();
        if (end != null) {
            end.next = null;
        }
        last.next = head;

        return first;
    }

    // 4 -> 3 -> 2 -> 1
    public ListNode reverseListNode(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        Solution61 solution61 = new Solution61();
        ListNode example = ListNode.getListOfNodes(1, 2);
        ListNode listNode = solution61.rotateRight(example, 2);

        printListNode(listNode);

        ListNode rotatedNode = ListNode.getListOfNodes(1, 2, 3, 4);
        printListNode(rotatedNode);
        ListNode listNode1 = solution61.reverseListNode(rotatedNode);
        printListNode(listNode1);
    }

    private static void printListNode(ListNode listNode) {
        boolean notEmpty = false;
        while (listNode != null) {
            System.out.print(listNode);
            listNode = listNode.next;
            notEmpty = true;
        }
        if (notEmpty) {
            System.out.println();
        } else {
            System.out.println("EMPTY");
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return val + " ";
        }

        public static ListNode getListOfNodes(int... i) {
            if (i.length == 0) return new ListNode();
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
}
