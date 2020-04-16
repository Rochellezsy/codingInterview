import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Tencent_test2 {

    //二叉树中序遍历
    public void bianli(TreeNode root){
        if(root==null)return;
        bianli(root.left);
        System.out.println(root.val);
        bianli(root.right);
    }

    public void bianli2(TreeNode root){
        if(root==null)return;
        Stack<TreeNode>stack=new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            while (root.left!=null){
                stack.add(root.left);
                root=root.left;
            }

        }




//        Queue<TreeNode>queue=new LinkedList<>();
//        queue.add(root);
//        while(!queue.isEmpty()){
//            TreeNode node=queue.poll();
//            if(node.left!=null){
//                queue.add(node.left);
//            }
//            System.out.println(node.val);
//            if(node.right!=null){
//                queue.add(node.right);
//            }
////            System.out.println(node.val);
//        }

    }


    public static void main(String[] args) {
        TreeNode head=new TreeNode(3);
        head.left=new TreeNode(2);
        head.right=new TreeNode(5);
        head.right.left=new TreeNode(4);
        Tencent_test2 test=new Tencent_test2();
        test.bianli2(head);
    }
}
