package Advanced_algorithm.Chapter3;

public class T4 {

    Integer res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        jisuan(root);
        return res;

    }

    public int jisuan(TreeNode root){
        if(root==null) return 0;
        int left=Math.max(jisuan(root.left),0);
        int right=Math.max(jisuan(root.right),0);
        res=Math.max(left+right+root.val,res);
        return Math.max(right,left)+root.val;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(-10);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(-15);
        root.right.right=new TreeNode(-7);
        T4 test=new T4();
        System.out.println(test.jisuan(root.right));
    }


}
