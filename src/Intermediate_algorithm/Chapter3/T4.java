package Intermediate_algorithm.Chapter3;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

public class T4 {
    public Node connect(Node root) {
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                Node node=queue.poll();
                if(node!=null){
                    queue.add(node.left);
                    queue.add(node.right);
                    if(i==size-1){
                        node.next=null;
                    }
                    else {
                        node.next=queue.peek();
                    }
                }
            }
        }
        return root;

    }
}
