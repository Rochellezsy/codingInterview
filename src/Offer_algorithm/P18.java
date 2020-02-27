package Offer_algorithm;

public class P18 {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode res=new ListNode(0);
        ListNode p=res;
        p.next=head;
        while(p.next!=null){
            if(p.next.val==val){
                p.next=p.next.next;
            }
            p=p.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(3);
        head.next=new ListNode(5);
        head.next.next=new ListNode(99);
        P18 test=new P18();

        System.out.println(test.deleteNode(head,99).val);
    }
}
