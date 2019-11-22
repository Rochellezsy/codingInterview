public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode=new ListNode(0);

        int l1val=(l1==null)?0:l1.val;
        int l2val=(l2==null)?0:l2.val;
        int jinwei=0;

        ListNode l3=resultNode;
        int l3val=l1val+l2val+jinwei;
        jinwei=0;
        if(l3val>9){
            l3val=l3val-10;
            jinwei=1;
        }
        l3.val=l3val;
        l3=l3.next;
        l1=(l1==null)?l1:l1.next;
        l2=(l2==null)?l2:l2.next;

        return resultNode.next;


    }




    public static void main(String[] args){
        ListNode node1_0=new ListNode(2);
        ListNode node1_1=new ListNode(4);
        ListNode node1_2=new ListNode(3);
        node1_0.next=node1_1;
        node1_1.next=node1_2;

        ListNode node2_0=new ListNode(5);
        ListNode node2_1=new ListNode(6);
        ListNode node2_2=new ListNode(4);
        node2_0.next=node2_1;
        node2_1.next=node2_2;

        Solution2 xx=new Solution2();

        ListNode resultnode0=xx.addTwoNumbers(node1_0,node2_0);
        ListNode resultnode1=xx.addTwoNumbers(node1_1,node2_2);
        ListNode resultnode2=xx.addTwoNumbers(node1_1,node2_2);




        System.out.println(xx.addTwoNumbers(node1_0,node2_0).val);








    }
}
