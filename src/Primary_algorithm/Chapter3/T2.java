package Primary_algorithm.Chapter3;

/**
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */

public class T2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res=new ListNode(0);
        res.next=head;
        ListNode pre=res;
        for(int i=0;i<n;i++){
            pre=pre.next;
        }
        ListNode last=res;
        while(pre.next!=null){
            pre=pre.next;
            last=last.next;
        }
        last.next=last.next.next;
        return res.next;
    }

    public static void main(String[] args) {
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);

        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;

        T2 test=new T2();
        ListNode res=test.removeNthFromEnd(a1,2);
        while(res!=null){
            System.out.println(res.val);
            res=res.next;
        }
    }
}
