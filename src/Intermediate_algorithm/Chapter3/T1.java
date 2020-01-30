package Intermediate_algorithm.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer>list=new ArrayList<>();
        digui(list,root);
        return list;

    }

    public void digui(List<Integer> list,TreeNode root){
        if(root!=null){
            digui(list,root.left);
            list.add(root.val);
            digui(list,root.right);
        }
    }

}
