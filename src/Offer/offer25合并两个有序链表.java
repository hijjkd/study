package Offer;

import leetcode.ListNode;

public class offer25合并两个有序链表 {int a=0;


    public ListNode Merge(ListNode list1, ListNode list2) {
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
}
