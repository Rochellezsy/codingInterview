/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/


public class P25 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode res=new ListNode(0);
        ListNode h=res;

        while(list1!=null && list2!=null){
            if(list1.val<list2.val){
                h.next=list1;
                list1=list1.next;
            }
            else if(list2.val<list1.val){
                h.next=list2;
                list2=list2.next;
            }
            h=h.next;
        }

        if(list1==null){
            h.next=list2;
        }
        else if(list2==null){
            h.next=list1;
        }

        return res.next;


    }

}
