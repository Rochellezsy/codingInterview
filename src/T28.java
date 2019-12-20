public class T28 {
    public boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        return  judge(pRoot.left,pRoot.right);
    }

    public boolean judge(TreeNode left,TreeNode right){
        if(left!=null && right==null) return false;
        if(left==null && right!=null) return false;
        if(left==null && right==null) return true;

        if(left.val==right.val){
            return judge(left.right,right.left) && judge(left.left,right.right);
        }
        return false;
    }

}
