import java.util.ArrayList;
import java.util.List;

public class P145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        digui(root,list);
        return list;

    }
    public void digui(TreeNode root,List<Integer>list){
        if(root!=null){
            digui(root.left,list);
            digui(root.right,list);
            list.add(root.val);
        }
    }
}
