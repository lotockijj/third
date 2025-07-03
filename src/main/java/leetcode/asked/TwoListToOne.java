package leetcode.asked;

import java.util.ArrayList;
import java.util.List;

public class TwoListToOne {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        List<Integer> resAsList = new ArrayList<>();
        while (list1 != null || list2 != null) {
            if(list2 == null){
                resAsList.add(list1.val);
                list1 = list1.next;
            } else if(list1 == null){
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
        if(resAsList.isEmpty()) return new ListNode();
        ListNode listNode = new ListNode(resAsList.get(resAsList.size() - 1));
        for (int i = resAsList.size() - 2; i >= 0; i--) {
            ListNode listNext = new ListNode();
            listNext.val = resAsList.get(i);
            listNext.next = listNode;
            listNode = listNext;
        }
        return listNode;
    }

    //Need to be reversed
    public ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode res;
        if (list1.val > list2.val) {
            res = list2;
            list2 = list2.next;
            res.next = null;
        } else {
            res = list1;
            list1 = list1.next;
            res.next = null;
        } // 4, 2, 1 and 4, 3, 1
        while (list1 != null || list2 != null) {
            if(list2 == null){
                ListNode temp = res;
                res = list1;
                list1 = list1.next;
                res.next = temp;
            } else if(list1 == null){
                ListNode temp = res;
                res = list2;
                list2 = list2.next;
                res.next = temp;
            } else if (list1.val > list2.val) {
                ListNode temp = res;
                res = list2;
                list2 = list2.next;
                res.next = temp;
            } else {
                ListNode temp = res;
                res = list1;
                list1 = list1.next;
                res.next = temp;
            }
        }
        return res;
    }
}
