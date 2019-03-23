package leetcode;

public class addTwoNumbers {
    /**
     * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

     如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

     您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

     示例：

     输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     输出：7 -> 0 -> 8
     原因：342 + 465 = 807
     * @param args
     */
    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);//新建一个链表，不破坏原有链表
        ListNode cur = result;
        int sum = 0;//计算每个节点的值
        ListNode p1=l1,p2=l2;//分别指向两个需要求值的链表

        while(p1 != null || p2!=null){
            if(p1 !=null){
                sum +=p1.val;
                p1=p1.next;
            }

            if (p2 !=null){
                sum +=p2.val;
                p2=p2.next;
            }

            cur.next=new ListNode(sum%10);
            sum /=10;
            cur =cur.next;
        }

        if(sum ==1){
            cur.next = new ListNode(1);
        }


        return result;
    }
}
