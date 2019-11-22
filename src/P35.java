class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }

public class P35 {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }

        clonenode(pHead);
        Randomnode(pHead);
        return dele(pHead);



    }

    public void clonenode(RandomListNode pHead){
//        RandomListNode node=pHead;
        while(pHead!=null){
            RandomListNode nodex=new RandomListNode(pHead.label);
            nodex.next=pHead.next;
            pHead.next=nodex;
            pHead=nodex.next;
        }
    }

    public void Randomnode(RandomListNode pHead){
        while(pHead!=null){
            if(pHead.random!=null){
                pHead.next.random=pHead.random.next;

            }
            pHead=pHead.next.next;
        }

    }

    public RandomListNode dele(RandomListNode pHead){

        RandomListNode clonehead=null;
        RandomListNode pp=null;


        clonehead=pHead.next;



        while(pHead!=null){

            pp=pHead.next;
            pHead.next=pp.next;
            if(pp.next!=null){
                pp.next=pHead.next.next;
            }
            pHead=pHead.next;

        }
        return clonehead;



    }


}


}
