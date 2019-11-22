public class SingleLinkedList {
    private int size;
    private Node head;

    SingleLinkedList(){
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

    public Object deletehead(){
        Object obj=head.data;
        head=head.next;
        size--;
        return obj;
    }

    public  Node find(Object obj){
        Node current=head;
        int tempsize=size;

        while(tempsize>0){
            if(obj.equals(current.data)){
                return current;
            }
            else{
                current=current.next;
            }
            tempsize--;
        }
        return null;
    }

/*
    public boolean delete(Object value){
        if(size == 0){
            return false;
        }
        Node current = head;
        Node previous = head;
        while(current.data != value){
            if(current.next == null){
                return false;
            }else{
                previous = current;
                current = current.next;
            }
        }
        //如果删除的节点是第一个节点
        if(current == head){
            head = current.next;
            size--;
        }else{//删除的节点不是第一个节点
            previous.next = current.next;
            size--;
        }
        return true;
    }
   */


    //删除指定的节点
    public boolean delete(Object obj){
        if(size==0){
            return false;
        }
        Node current=head;
        Node previous=head;

        while(current.data!=obj){
            if(current.next==null){
                return false;
            }
            else{
                previous=current;
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



    public boolean isEmpty(){
        return (size==0);
    }

    public void display(){
        if(size>0){
            Node node=head;
            int tempsize=size;
            if(tempsize==1){
                System.out.print("["+node.data+"]");
                return;
            }
            while (tempsize>0){
                if(node.equals(head)){
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
        else{
            System.out.println("[]");
        }


    }

/*
    public void display(){
        if(size >0){
            Node node = head;
            int tempSize = size;
            if(tempSize == 1){//当前链表只有一个节点
                System.out.println("["+node.data+"]");
                return;
            }
            while(tempSize>0){
                if(node.equals(head)){
                    System.out.print("["+node.data+"->");
                }else if(node.next == null){
                    System.out.print(node.data+"]");
                }else{
                    System.out.print(node.data+"->");
                }
                node = node.next;
                tempSize--;
            }
            System.out.println();
        }else{//如果链表一个节点都没有，直接打印[]
            System.out.println("[]");
        }

    }
*/

    public static void main(String[] args){

        SingleLinkedList sl=new SingleLinkedList();
        sl.addhead("A");
        sl.addhead("B");
        sl.addhead("C");
        sl.addhead("D");



        sl.display();
        System.out.println(sl.size);

        sl.deletehead();
        sl.display();

        sl.addhead("E");

        sl.delete("B");
        sl.display();

    }


}
