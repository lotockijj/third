package leetcode.one;

import leetcode.asked.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KSortedLists {
    /*
    Input: lists = [[1,4,5],[1,3,4],[2,6]]
    Output: [1,1,2,3,4,4,5,6]
    Explanation: The linked-lists are:
    [ 1->4->5, 1->3->4, 2->6 ]
    merging them into one sorted list:
    1->1->2->3->4->4->5->6
     */
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        List<ListNode> list = Arrays.asList(lists);
        return divideAndSortListOfNodes(list);
    }

    private ListNode divideAndSortListOfNodes(List<ListNode> list) {
        int mid = list.size() / 2;
        List<ListNode> left = list.subList(0, mid + 1);
        List<ListNode> right = list.subList(mid + 1, list.size());
        return mergeTwoLists(left, right);
    }

    private ListNode mergeTwoLists(List<ListNode> left, List<ListNode> right) {
        if (left.size() == 1 && right.size() == 1) {
            return sortLists(left.get(0), right.get(0));
        } else if (left.size() == 2 && right.isEmpty()) {
            return sortLists(left.get(0), left.get(1));
        } else if (right.size() == 2 && left.isEmpty()) {
            return sortLists(right.get(0), right.get(1));
        } else if (left.isEmpty() && right.size() == 1) {
            return right.get(0);
        } else if (right.isEmpty() && left.size() == 1) {
            return left.get(0);
        } else {
            int midLeft = left.size() == 1 ? 0 : left.size() / 2;
            ListNode leftNode = mergeTwoLists(left.subList(0, midLeft + 1), left.subList(midLeft + 1, left.size()));
            int midRight = right.size() == 1 ? 0 : right.size() / 2;
            ListNode rightNode = mergeTwoLists(right.subList(0, midRight + 1), right.subList(midRight + 1, right.size()));
            return sortLists(leftNode, rightNode);
        }
    }

    private ListNode sortLists(ListNode leftNode, ListNode rightNode) {
        return mergeTwoLists(leftNode, rightNode);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        List<Integer> resAsList = new ArrayList<>();
        while (list1 != null || list2 != null) {
            if (list2 == null) {
                resAsList.add(list1.val);
                list1 = list1.next;
            } else if (list1 == null) {
                resAsList.add(list2.val);
                list2 = list2.next;
            } else if (list1.val > list2.val) {
                resAsList.add(list2.val);
                list2 = list2.next;
            } else {
                resAsList.add(list1.val);
                list1 = list1.next;
            }
        }
        return getListOfNodes(resAsList);
    }

    private ListNode getListOfNodes(List<Integer> resAsList) {
        if (resAsList.isEmpty()) return new ListNode();
        ListNode listNode = new ListNode(resAsList.get(resAsList.size() - 1));
        for (int i = resAsList.size() - 2; i >= 0; i--) {
            ListNode listNext = new ListNode();
            listNext.val = resAsList.get(i);
            listNext.next = listNode;
            listNode = listNext;
        }
        return listNode;
    }
}
