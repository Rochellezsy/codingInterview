public class test1 {
    public boolean isPalindrome(ListNode head) {
        ListNode ori=head;
        ListNode temp=reverse(head);
        while(ori!=null){
            if(ori.val!=temp.val){
                return false;
            }
            ori=ori.next;
            temp=temp.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);
        head.next.next.next=new ListNode(1);
        System.out.println(new test1().isPalindrome(head));

    }
}
