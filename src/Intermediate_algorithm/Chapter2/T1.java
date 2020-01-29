package Intermediate_algorithm.Chapter2;

public class T1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode p=res;

        int c=0;
        while(l1!=null && l2!=null){
            int ans= l1.val+l2.val+c;
            p.next=new ListNode(ans%10);
            c=ans/10;
            l1=l1.next;
            l2=l2.next;
            p=p.next;
        }


        while(l1==null && l2!=null){
            p.next=new ListNode((l2.val+c)%10);
            c=(l2.val+c)/10;
            p=p.next;
            l2=l2.next;
        }

        while(l1!=null && l2==null){
            p.next=new ListNode((l1.val+c)%10);
            c=(l1.val+c)/10;
            p=p.next;
            l1=l1.next;
        }

        if(l1==null&&l2==null&&c==1){
            p.next=new ListNode(c);
        }

        return res.next;

    }
}
