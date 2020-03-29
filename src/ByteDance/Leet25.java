package ByteDance;

public class Leet25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur=head;
        int count=0;
        while(cur!=null && count!=k){
            cur=cur.next;
            count++;
        }

        if(count==k){
            cur=reverseKGroup(cur,k);
            while(count!=0){
                count--;
                ListNode temp=head.next;
                head.next=cur;
                cur=head;
                head=temp;
            }
            head=cur;
        }
        return head;

    }
}
