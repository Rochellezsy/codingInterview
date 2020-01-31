package Intermediate_algorithm.Chapter2;

public class T2 {
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null ||head.next.next==null)return head;

        ListNode p=head;
        ListNode q=head.next;
        ListNode phead=p;
        ListNode qhead=q;

        while(q!=null && q.next!=null){
            p.next=q.next;
            q.next=q.next.next;
            p=p.next;
            q=q.next;
        }
        p.next=qhead;
        return phead;


    }
}
