import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main_1 {
    public List<Integer> RightSideView(TreeNode root){
        List<Integer>list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                if(i==size-1){
                    list.add(node.val);
                }
            }

        }
        return list;

    }


    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        //int a = in.nextInt();
        //System.out.println(a);
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(5);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(6);

        Main_1 main_1=new Main_1();
        List<Integer>res=main_1.RightSideView(root);

        int size=res.size();
        for(int i=0;i<size;i++){
            System.out.print(res.get(i)+" ");
        }

    }
}
