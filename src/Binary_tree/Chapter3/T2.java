package Binary_tree.Chapter3;

import java.util.Arrays;

public class T2 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0 ||inorder.length==0)return null;
        TreeNode root=new TreeNode(preorder[0]);
        int index=0;
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                index=i;
                break;
            }
        }
        root.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        root.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),Arrays.copyOfRange(inorder,index+1,inorder.length));

        return root;
    }
}
