public class T28_ {
    public boolean isSymmetrical(TreeNode pRoot)
    {
        TreeNode pre=copy(pRoot);
        Mirror(pRoot);
        return judge(pre, pRoot);
    }

    private void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
        }

    }

    private TreeNode copy(TreeNode pRoot){
        TreeNode node=null;
        if(pRoot!=null){
            node=new TreeNode(pRoot.val);
            node.right=copy(pRoot.right);
            node.left=copy(pRoot.left);
        }
        return node;
    }


    private boolean judge(TreeNode pre, TreeNode after){
        if(pre==null && after!=null)return false;
        if(pre!=null && after==null)return false;
        if(pre==null && after==null)return true;
        if(pre.val==after.val){
            return judge(pre.left,after.left) &&judge(pre.right,after.right);
        }
        return false;

    }

}
