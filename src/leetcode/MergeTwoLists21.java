package leetcode;

public class MergeTwoLists21 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        l1.data = 1;
        l1.next.data = 0;
        mergeTwoLists(l1,l2);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result =new ListNode(0);
        ListNode cur = result;
        while(l1 != null && l2 != null){
            if(l1.data >l2.data){
                cur.next = l2;
                cur=cur.next;
                l2 = l2.next;
            }else {
                cur.next=l1;
                cur=cur.next;
                l1=l1.next;
            }
        }

        if(l1.next ==null){ cur.next = l2;}

        else
            cur.next = l1;

        return result.next;

    }
}
