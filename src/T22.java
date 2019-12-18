public class T22 {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k==0 || head==null) return null;
        ListNode pre=head;
        ListNode after=head;

        for(int i=0;i<k-1;i++){
            if(pre.next!=null){
                pre=pre.next;
            }
            else {
                return null;
            }
        }
        while(pre.next!=null){
            pre=pre.next;
            after=after.next;
        }
        return after;

    }

    public static void main(String[] args) {
        ListNode node=new ListNode(2);
        node.next=new ListNode(3);
        node.next.next=new ListNode(4);
        node.next.next.next=new ListNode(5);
        node.next.next.next.next=new ListNode(6);

        T22 test=new T22();

        System.out.println(test.FindKthToTail(node,1).val);
    }
}
