package Intermediate_algorithm.Chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class T2 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)return new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(root);
        int level=1;

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            if(level%2==1){
                int size=stack1.size();
                List<Integer>list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode node=stack1.pop();
                    if(node.left!=null){
                        stack2.push(node.left);
                    }
                    if(node.right!=null){
                        stack2.push(node.right);
                    }
                    list.add(node.val);
                }
                res.add(list);
                level++;
                continue;
            }
            if(level%2==0){
                int size=stack2.size();
                List<Integer>list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode node=stack2.pop();
                    if(node.right!=null){
                        stack1.push(node.right);
                    }
                    if(node.left!=null){
                        stack1.push(node.left);
                    }
                    list.add(node.val);
                }
                res.add(list);
                level++;
                continue;
            }
        }
        return res;



    }
}
