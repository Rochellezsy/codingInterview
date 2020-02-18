package Binary_tree.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class T6 {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder s=new StringBuilder("");
        se(root,s);
        return String.valueOf(s);
    }

    public void se(TreeNode root,StringBuilder s){
        if(root!=null){
            s.append(root.val);
            s.append(",");
            se(root.left,s);
            se(root.right,s);
        }else {
            s.append("null,");
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        List<String> list=new ArrayList<>();
        String[]datas=data.split(",");
        for (String s : datas) {
            list.add(s);
        }
        return de(list);


    }

    public TreeNode de(List<String>list){
        if(list.get(0).equals("null")){
            list.remove(0);
            return null;
        }
        TreeNode root=new TreeNode(Integer.valueOf(list.get(0)));
        list.remove(0);
        root.left=de(list);
        root.right=de(list);
        return root;
    }
}
