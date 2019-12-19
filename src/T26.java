public class T26 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null) return false;

        if(root1.val==root2.val){
            if(judge(root1,root2)){
                return true;
            }
        }
        return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }

    public boolean judge(TreeNode fu,TreeNode zi){
        if(zi==null) return true;
        if(fu==null) return false;
        if(fu.val==zi.val){
            return judge(fu.left,zi.left) && judge(fu.right,zi.right);
        }
        return false;

    }
}
