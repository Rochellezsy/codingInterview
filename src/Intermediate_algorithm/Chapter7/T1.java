package Intermediate_algorithm.Chapter7;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class T1 {
    // Encodes a tree to a single string.
    public void reserialize(StringBuilder s,TreeNode root) {
        if(root==null){
            s.append("null,");
        }
        else {
            s.append(root.val);
            s.append(",");
            reserialize(s,root.left);
            reserialize(s,root.right);
        }
    }

    public String serialize(TreeNode root) {
        StringBuilder s=new StringBuilder();
        reserialize(s,root);
        return s.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[]datas=data.split(",");
        List<String>list=new ArrayList<>();
        for (String s : datas) {
            list.add(s);
        }
        return redeserialize(list);
    }

    public TreeNode redeserialize(List<String>list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }

        TreeNode root=new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left=redeserialize(list);
        root.right=redeserialize(list);

        return root;
    }
}
