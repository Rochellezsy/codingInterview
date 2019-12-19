public class T25 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res=new ListNode(0);
        ListNode p=res;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                p.next=list1;
                list1=list1.next;
            }
            else {
                p.next=list2;
                list2=list2.next;
            }
            p=p.next;
        }
        if(list1==null){
            p.next=list2;
        }

        if(list2==null){
            p.next=list1;
        }
        return res.next;
    }
}
