package Offer;

import leetcode.ListNode;

public class offer25合并两个有序链表 {

    private static ListNode listnode;

    public static void main(String[] args) {

        ListNode head1 = new ListNode(0);
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(9);
        head1.next = n1;
        n1.next = n2;
        n2.next = n3;

        ListNode head2 = new ListNode(1);
        ListNode n4 = new ListNode(2);
        ListNode n5 = new ListNode(6);
        ListNode n6 = new ListNode(7);
        head2.next = n4;
        n4.next = n5;
        n5.next = n6;


        ListNode result = MergeMethod1(head1, head2);

        result.print();
    }


    public static ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode listnode;

        if (list1.data < list2.data) {
            listnode = list1;
            listnode.next = Merge(list1.next, list2);

        } else {
            listnode = list2;
            listnode.next = Merge(list1, list2.next);

        }
        return listnode;
    }

    /**
     * 有序链表。删除重复的元素
     * @param list1
     * @param list2
     * @return
     */
    public static ListNode MergeMethod1(ListNode list1, ListNode list2) {
        ListNode listNode = new ListNode(-1);
        ListNode first = listNode;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                listNode.next = list1;
                list1 = list1.next;
            } else {
                listNode.next = list2;
                list2 = list2.next;
            }
            if (listNode.data != listNode.next.data)
                listNode = listNode.next;
        }


        while (list1 != null) {
            listNode.next = list1;
            list1 = list1.next;
            if (listNode.data != listNode.next.data)
                listNode = listNode.next;
        }
        while (list2 != null) {
            listNode.next = list2;
            list2 = list2.next;
            if (listNode.data != listNode.next.data)
                listNode = listNode.next;
        }

        return first.next;
    }
}
