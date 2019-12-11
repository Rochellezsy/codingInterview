import java.util.ArrayList;

public class T6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        ListNode pre=null;
        ListNode cur=listNode;

        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        ArrayList<Integer> list=new ArrayList<>();

        while(pre!=null){
            list.add(pre.val);
            pre=pre.next;
        }
        return list;

    }
}
