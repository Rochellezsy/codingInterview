package Recursive_algorithm.Chapter1;

import java.util.List;

public class T2 {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode newhead=head.next;
        ListNode fast=head.next;
        ListNode slow=head;
        ListNode last=fast.next;
        fast.next=null;
        merge(reverse(slow),swapPairs(last));
        return newhead;
    }

    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }

    public ListNode merge(ListNode l1,ListNode l2){
        ListNode res=new ListNode(0);
        ListNode l=res;
        while(l1!=null){
            l.next=l1;
            l1=l1.next;
            l=l.next;
        }
        l.next=l2;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        ListNode p=new ListNode(10);
        T2 test=new T2();
        ListNode res=test.swapPairs(head);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }

    }
}
