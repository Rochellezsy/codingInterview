package Binary_tree.Chapter3;

import java.util.Arrays;

public class T1 {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length==0 ||postorder.length==0)return null;
        int len=postorder.length-1;
        TreeNode root=new TreeNode(postorder[len]);
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==postorder[len]){
                index=i;
            }
        }
        root.left=buildTree(Arrays.copyOfRange(inorder,0,index),Arrays.copyOfRange(postorder,0,index));
        root.right=buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),Arrays.copyOfRange(postorder,index,postorder.length-1));

        return root;
    }
}
