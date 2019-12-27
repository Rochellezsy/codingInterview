import java.util.ArrayList;
import java.util.Stack;

public class T32_3 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot==null) return new ArrayList<>();
        return BFSZ(pRoot);
    }

    public ArrayList<ArrayList<Integer>> BFSZ(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int level=1;
        Stack<TreeNode> stack1=new Stack<>();
        Stack<TreeNode> stack2=new Stack<>();
        stack1.push(pRoot);

        while(!stack1.isEmpty()||!stack2.isEmpty()){
            if(level%2!=0){
                ArrayList<Integer> list=new ArrayList<>();
                int size=stack1.size();
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
                ArrayList<Integer> list=new ArrayList<>();
                int size=stack2.size();
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
