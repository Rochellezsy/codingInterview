public class SinglyList {
    int size;
    ListNode head;

    SinglyList(){
        size=0;
        head=null;
    }

    public int addhead(int data){
        ListNode node=new ListNode(data);
        if(size==0){
            head=node;
        }
        else{
            node.next=head;
            head=node;
        }
        size++;
        return data;
    }

    public void display(){
        if(size>0){
            ListNode node=head;
            int tempsize=size;
            if(tempsize==1){
                System.out.print("["+node.val+"]");
                return;
            }
            while (tempsize>0){
                if(node.equals(head)){
                    System.out.print("["+node.val+"->");
                }
                else if(node.next==null){
                    System.out.print(node.val+"]");
                }
                else{
                    System.out.print(node.val+"->");
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

}
