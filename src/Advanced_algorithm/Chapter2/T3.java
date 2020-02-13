package Advanced_algorithm.Chapter2;

public class T3 {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Node p=head;
        while(p!=null){
            Node p2=new Node(p.val);
            p2.next=p.next;
            p.next=p2;
            p=p.next.next;
        }

        Node q=head;
        while(q!=null){
            if(q.random==null){
                q.next.random=null;
            }
            else {
                q.next.random=q.random.next;
            }
            q=q.next.next;
        }

        Node old=head;
        Node newhead=head.next;
        Node ptr=newhead;
        while(old!=null){
            old.next=old.next.next;
            ptr.next=ptr.next!=null?ptr.next.next:null;
            old=old.next;
            ptr=ptr.next;
        }
        return newhead;

    }

}
