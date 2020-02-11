package Advanced_algorithm.Chapter2;

public class T1 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        if(lists.length==1)return lists[0];
        ListNode res=mergr2List(lists[0],lists[1]);

        for(int i=2;i<lists.length;i++){
            res=mergr2List(res,lists[i]);
        }
        return res;
    }

    public ListNode mergr2List(ListNode l1,ListNode l2){
        ListNode res=new ListNode(0);
        ListNode p=l1;
        ListNode q=l2;
        ListNode h=res;
        while(p!=null && q!=null){
            if(p.val<=q.val){
                h.next=p;
                p=p.next;
                h=h.next;
            }
            else if(p.val>q.val){
                h.next=q;
                q=q.next;
                h=h.next;
            }
        }
        if(p==null){
            h.next=q;
        }
        if(q==null){
            h.next=p;
        }
        return res.next;
    }
}
