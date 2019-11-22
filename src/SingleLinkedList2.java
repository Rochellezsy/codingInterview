public class SingleLinkedList2 {
    private int size;
    private Node head;

    SingleLinkedList2(){
        size=0;
        head=null;
    }
    public class Node{
        private Object data;
        private Node next;

        Node(Object data){
            this.data=data;
        }

    }
    public Object addhead(Object obj){
        Node newhead=new Node(obj);
        if(size==0){
            head=newhead;
        }
        else{
            newhead.next=head;
            head=newhead;
        }
        size++;
        return obj;
    }

    public void deletehead(){
        head=head.next;
        size--;
    }

    public Node find(Object obj){
        int tempsize=size;
        Node current=head;

        while (tempsize>0){
            if(obj.equals(current.data)){
                return current;
            }else {
                current=current.next;

            }
        }
        return null;
    }

    public boolean delete(Object obj){
        if(size==0){
            return false;
        }
  //      int tempsize=size;
        Node current=head;
        Node previous=head;

        while(current.data!=obj){
            if(current.next==null){
                return false;
            }
            else{
        //        previous=current;
                current=current.next;
            }
        }
        if(current==head){
            head=current.next;
            size--;
        }
        else{
            previous.next=current.next;
            size--;
        }



        return true;
    }


    public void display(){
        if(size>0){
            int tempsize=size;
            Node node=head;
            if(tempsize==1){
                System.out.print("["+node.data+"]");
            }
            while (tempsize>0){
                if(node==head){
                    System.out.print("["+node.data+"->");
                }
                else if(node.next==null){
                    System.out.print(node.data+"]");
                }
                else{
                    System.out.print(node.data+"->");
                }
                node=node.next;
                tempsize--;
            }
            System.out.println();
        }
        if(size==0){
            System.out.println("[]");
        }

    }




    public static void main(String[] args){
        SingleLinkedList2 sl2=new SingleLinkedList2();
        sl2.addhead("A");
        sl2.addhead("B");
        sl2.addhead("C");
        sl2.addhead("F");

        sl2.delete("C");

        sl2.display();

    }


}
