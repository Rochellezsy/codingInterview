import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class T32_2 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        if(pRoot==null) return new ArrayList<>();
        return BFS(pRoot);
    }

    public ArrayList<ArrayList<Integer>> BFS(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);

        while(!queue.isEmpty()){
            ArrayList<Integer> list=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                list.add(node.val);
            }
            res.add(list);
        }
        return res;

    }
}
