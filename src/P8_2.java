public class P8_2 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null)
            return pNode;
        if (pNode.right != null) { // 节点有右子树
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        } else if ( pNode.next != null && pNode.next.left == pNode) { // 节点无右子树且该节点为父节点的左子节点
            return pNode.next;
        } else if (pNode.next != null && pNode.next .right == pNode) { // 节点无右子树且该节点为父节点的右子节点
            while(pNode.next != null && pNode .next .left != pNode){
                pNode = pNode.next ;
            }
            return pNode.next ;
        }else{
            return pNode.next ;//节点无父节点 ，即节点为根节点
        }
    }
}
