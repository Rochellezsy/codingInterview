package Primary_algorithm.Chapter4;

public class T3 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;
        return judge(root.left,root.right);

    }

    public boolean judge(TreeNode left,TreeNode right){
        if(left==null && right==null) return true;
        if(left==null && right!=null) return false;
        if(left!=null && right==null) return false;
        if(left.val==right.val){
            return judge(left.left,right.right) && judge(left.right,right.left);
        }
        return false;
    }
}
