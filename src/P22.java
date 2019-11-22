/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.ArrayList;

public class P22 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ArrayList<ListNode> list=new ArrayList<>();

        ListNode node=head;

        while(node!=null){
            list.add(0,node);
            node=node.next;
        }

        if(list.size()<k){
            return null;
        }
        else if(k>0){
            return list.get(k-1);
        }


        return null;


    }

}
