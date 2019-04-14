package Offer;

import leetcode.ListNode;

public class offer25 {int a=0;


    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;

        ListNode listnode = null;

        if (list1.val < list2.val) {
            listnode = list1;
            listnode.next = Merge(list1.next, list2);
        } else {
            listnode = list2;
            listnode.next = Merge(list1, list2.next);
        }
        return listnode;
    }
}
