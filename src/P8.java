public class P8 {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null) return pNode;
        else {
            if(pNode.right!=null){
                pNode=pNode.right;
                while (pNode.left!=null){
                    pNode=pNode.left;
                }
                return pNode;
            }
            else if(pNode.next!=null && pNode.next.left==pNode){
                return pNode.next;
            }
            else if(pNode.next!=null && pNode.next.right==pNode){
                while (pNode.next.left!=pNode){
                    pNode=pNode.next;
                }
                return pNode.next;
            }
            else {
                return pNode.next ;//节点无父节点 ，即节点为根节点
            }
        }
    }
}
