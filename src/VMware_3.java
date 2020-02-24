import java.util.ArrayList;
import java.util.List;

public class VMware_3 {
    static class NewNode{
        NewNode left;
        NewNode right;
        int val;
        NewNode(int val){
            this.val=val;
        }
    }

    //处理函数
    public List<Integer> deal(NewNode head){
        List<Integer>list=new ArrayList<>();
        NewNode p=head;
        NewNode temp=head;
        while(p.left!=null && p.left!=temp){
            if(p.right!=null){
                list.add(p.right.val);
            }
            p=p.left;
        }
        return list;
    }

    //主函数
    public static void main(String[] args) {
        VMware_3 test=new VMware_3();
        NewNode head=new NewNode(1);
        head.left=new NewNode(2);
        head.left.left=new NewNode(3);
        head.left.left.left=new NewNode(4);
        head.left.left.left.right=head.left.left;
        head.left.left.left.left=new NewNode(5);
        head.right=head.left.left.left.left;

        List<Integer>res=new ArrayList<>();
        res=test.deal(head);

        for (Integer re : res) {
            System.out.println(re);
        }

    }
}
