package Offer;

import leetcode.ListNode;

public class offer22链表中倒数第k个数 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(2);
        listNode.add(9);
        listNode.add(5);
        listNode.print();
        int k=1;
        System.out.println("倒数第"+ k +"个"+FindKthToTail(listNode,k).data);


    }

    public static ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k == 0) {
            return null;
        }
        ListNode pre = head;//pre从头节点开始，向后走k-1步。如 k=2 1、2、3、4、5
        ListNode last = head;

        for (int i = 0; i < k - 1; i++) {
            if (pre.next != null) {
                pre = pre.next;
            } else
                return null;
        }

        while (pre.next != null) {
            pre = pre.next;
            last = last.next;
        }
        return last;
    }
}
