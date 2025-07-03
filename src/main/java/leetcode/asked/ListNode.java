package leetcode.asked;

public class ListNode {
    public int val;
    public ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListOfNodes(int... i) {
        if(i.length == 0) return new ListNode();
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

