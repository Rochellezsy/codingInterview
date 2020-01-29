package Intermediate_algorithm.Chapter2;

public class T1_1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode res=new ListNode(0);
        ListNode p=res;
        int c=0;

        while(l1!=null ||l2!=null){
            int v1=l1!=null?l1.val:0;
            int v2=l2!=null?l2.val:0;
            int ans=v1+v2+c;

            p.next=new ListNode(ans%10);
            c=ans/10;

            if(l1!=null){
                l1=l1.next;
            }

            if(l2!=null){
                l2=l2.next;
            }
            p=p.next;
        }
        if(c==1){
            p.next=new ListNode(1);
        }
        return res.next;

    }

}
