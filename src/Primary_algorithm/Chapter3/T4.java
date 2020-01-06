package Primary_algorithm.Chapter3;

public class T4 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode p=res;

        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                p.next=l1;
                l1=l1.next;
            }
            else if(l1.val>l2.val){
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
