import java.util.Stack;

public class P22_1 {
    public ListNode FindKthToTail(ListNode head,int k) {
        Stack<ListNode> stack=new Stack<>();

        ListNode node=head;

        while(node!=null){
            stack.push(node);
            node=node.next;
        }
        int i=0;

        if(head==null ||k<=0||k>stack.size()){
            return null;
        }

        while (i<k-1){
            stack.pop();
            i++;
        }
        return stack.pop();



    }
}
