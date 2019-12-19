public class T24 {
    public ListNode ReverseList(ListNode head) {
        ListNode cur=head;
        ListNode pre=null;

        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
