package Sort_algorithm;

public class ListNodeSort {

    public ListNode sort(ListNode head){
        if(head==null || head.next==null)return head;
        ListNode slow=head;
        ListNode fast=head.next;
        ListNode l=head;

        while(fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        ListNode r=slow.next;
        slow.next=null;
        ListNode left=sort(r);
        ListNode right=sort(l);
        return merge(left,right);
    }

    public ListNode merge(ListNode l1, ListNode l2){
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


}
