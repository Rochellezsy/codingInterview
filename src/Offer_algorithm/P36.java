package Offer_algorithm;

public class P36 {
    Node head=null;
    Node pre=null;
    Node tail=null;
    public Node treeToDoublyList(Node root) {
        if(root==null)return root;
        inorder(root);
        head.left=tail;
        tail.right=head;
        return head;
    }

    public void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        if(pre==null){
            head=root;
        }
        else {
            pre.right=root;
        }
        root.left=pre;
        pre=root;
        tail=root;
        inorder(root.right);
    }



}
