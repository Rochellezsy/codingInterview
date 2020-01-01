package Primary_algorithm.Chapter3;

public class T1 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;

    }
}
