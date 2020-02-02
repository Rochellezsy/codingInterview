package Intermediate_algorithm.Chapter3;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T5 {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer>list=new ArrayList<>();
        bfs(root,list);
        Collections.sort(list);
        return list.get(k-1);
    }
    public void bfs(TreeNode root, List<Integer> list){
        if(root!=null){
            list.add(root.val);
            bfs(root.left,list);
            bfs(root.right,list);
        }
    }
}
