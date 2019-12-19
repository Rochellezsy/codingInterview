import java.util.HashSet;

public class T23 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        HashSet<ListNode> set=new HashSet<>();
        while(pHead!=null){
            if(!set.contains(pHead)){
                set.add(pHead);
            }
            else {
                return pHead;
            }
            pHead=pHead.next;
        }
        return null;

    }
}
