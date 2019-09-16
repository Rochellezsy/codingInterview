public class OrderLinkedList {
    private Node head;
    OrderLinkedList(){
        head = null;
    }
    public class Node{
        private int data;
        private Node next;

        Node(int data){
            this.data=data;
        }
    }

    public void insert(int value){
        Node node=new Node(value);
        Node previous=null;
        Node current=head;

        while(current!=null && current.data<value){
            previous=current;
            current=current.next;
        }
        if(previous==null){
            head=node;
            head.next=current;
        }else{
            previous.next=node;
            node.next=current;
        }

    }

    public void deletehead(){
        head=head.next;
    }

    public void display(){
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }

        System.out.println();
    }

    public static void main(String[] args){
        OrderLinkedList ol=new OrderLinkedList();
        ol.insert(10);
        ol.insert(18);
        ol.insert(13);
        ol.insert(21);
        ol.insert(6);

        ol.display();

        ol.deletehead();;
        ol.display();;
    }


}
