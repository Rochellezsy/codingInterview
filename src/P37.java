import java.util.ArrayList;

public class P37 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null){
            return null;
        }
        ArrayList<TreeNode> list=new ArrayList<>();

        mid(pRootOfTree,list);
        return bian(list);

    }

    public void mid(TreeNode pRootOfTree, ArrayList<TreeNode> list){
        if(pRootOfTree==null){
            return;
        }
        if(pRootOfTree.left!=null){
            mid(pRootOfTree.left,list);
        }
        list.add(pRootOfTree);
        if(pRootOfTree.right!=null){
            mid(pRootOfTree.right,list);
        }
    }

    public TreeNode bian(ArrayList<TreeNode> list){
        for(int i=0;i<list.size()-1;i++){
            list.get(i).right=list.get(i+1);
            list.get(i+1).left=list.get(i);
        }
        return list.get(0);

    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        root.left=new TreeNode(6);
        root.right=new TreeNode(14);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(8);
        root.right.left=new TreeNode(12);
        root.right.right=new TreeNode(16);

        P37 test=new P37();
        System.out.print(test.Convert(root).val);;




    }




}
