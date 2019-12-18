/*
在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
重复的结点不保留，返回链表头指针。
例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class T18 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode res=new ListNode(-1);
        res.next=pHead;
        ListNode p=res;
        while(p.next!=null && p.next.next!=null){
            if(p.next.val==p.next.next.val){
                int temp=p.next.val;
                while(p.next.val==temp){
                    p.next=p.next.next;
                    if(p.next==null){
                        break;
                    }
                }
                continue;
            }
            p=p.next;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode node=new ListNode(2);
        node.next=new ListNode(4);
        node.next.next=new ListNode(4);
        node.next.next.next=new ListNode(4);

        T18 test=new T18();
        test.deleteDuplication(node);
        while (node!=null){
            System.out.println(node.val);
            node=node.next;
        }
    }

}
