import java.util.LinkedList;
import java.util.Queue;

public class P662 {
    class plusNode{
        TreeNode node;
        int pos;
        plusNode(TreeNode node, int pos){
            this.node=node;
            this.pos=pos;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {
        int ans=0;
        if(root==null)return ans;
        Queue<plusNode> queue=new LinkedList<>();
        queue.add(new plusNode(root,1));
        while(!queue.isEmpty()){
            int size=queue.size();
            int x=0;
            int y=0;
            for(int i=0; i<size; i++){
                plusNode temp = queue.poll();
                if(i==0){
                    x=temp.pos;
                }
                if(temp.node.left!=null){
                    queue.add(new plusNode(temp.node.left, 2*temp.pos));
                }
                if(temp.node.right!=null){
                    queue.add(new plusNode(temp.node.right, 2*temp.pos+1));
                }
                if(i==size-1){
                    y=temp.pos;
                }
            }
            ans=Math.max(ans,y-x+1);
        }
        return ans;

    }
}
