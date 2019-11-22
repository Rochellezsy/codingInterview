import java.util.ArrayList;

public class P34 {

    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    ArrayList<Integer> in=new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {

        if(root==null){
            return result;
        }

        in.add(root.val);
        target=target-root.val;

        ArrayList<Integer> inr=new ArrayList<>(in);


        if(target==0&&root.right==null&&root.left==null){
            result.add(inr);
        }

        FindPath(root.left,target);
        FindPath(root.right,target);

        in.remove(in.size()-1);

        return result;

    }

    public static void main(String[] args) {
        P34 pp=new P34();
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(12);
        root.right.left = null;
        root.right.right = null;
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(7);
        root.left.left.left = null;
        root.left.left.right = null;
        root.left.right.left = null;
        root.left.right.right = null;

        pp.FindPath(root,22);
        System.out.println(pp.in);

    }

}
