/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/

import javax.sound.sampled.ReverbType;
import java.util.ArrayList;
import java.util.Stack;

public class P24 {
    public ListNode ReverseList(ListNode head) {

        if(head==null ||head.next==null){
            return head;
        }

        ListNode pre=null;
        ListNode next=null;

        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;

        }

        return pre;



        /*
        Stack<ListNode> stack=new Stack<>();

        if(head==null ||head.next==null){
            return head;
        }
        ListNode node=head;
        while(node!=null){
            stack.push(node);
            node=node.next;
        }

        return stack.pop();

         */
        /*
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = null; // 当前节点的前一个节点
        ListNode next = null; // 当前节点的下一个节点
        while( head != null){
            next = head.next; // 记录当前节点的下一个节点位置；
            head.next = pre; // 让当前节点指向前一个节点位置，完成反转
            pre = head; // pre 往右走
            head = next;// 当前节点往右继续走
        }
        return pre;
         */




    }

    public static void main(String []args){
        ListNode a1=new ListNode(1);
        ListNode a2=new ListNode(2);
        ListNode a3=new ListNode(3);
        ListNode a4=new ListNode(4);
        ListNode a5=new ListNode(5);

        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
//        a4.next=a5;

        P24 pp=new P24();
//        pp.ReverseList(a1);

        System.out.println(pp.ReverseList(a1).val);


    }
}
