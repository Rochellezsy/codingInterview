/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.ArrayList;

public class P6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode tempNode=listNode;

        ArrayList<Integer> list=new ArrayList<>();

        while(tempNode!=null){
            list.add(0,tempNode.val);
            tempNode=tempNode.next;

        }
        return list;

    }

}
