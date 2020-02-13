package Advanced_algorithm.Chapter2;

import java.util.List;

public class T2 {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode temp=slow.next;
        slow.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(temp);
        return mergeList(left,right);
    }

    public ListNode mergeList(ListNode l1,ListNode l2){
        ListNode res=new ListNode(0);
        ListNode p=res;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next=l1;
                l1=l1.next;
            }
            else {
                p.next=l2;
                l2=l2.next;
            }
            p=p.next;
        }
        if(l1==null){
            p.next=l2;
        }
        if(l2==null){
            p.next=l1;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(4);
        head.next=new ListNode(2);
        head.next.next=new ListNode(1);
        head.next.next=new ListNode(3);
        T2 test=new T2();
        test.sortList(head);
    }
}
