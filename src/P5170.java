public class P5170 {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[]holder=new int[n];
        for(int i=0;i<n;i++){
            if(i!=0 && holder[i]==0){
                return false;
            }

            if(leftChild[i]!=-1){
                holder[leftChild[i]]+=1;
                if(holder[leftChild[i]]>1){
                    return false;
                }
                if(leftChild[i]<i){
                    return false;
                }
            }
            if(rightChild[i]!=-1){
                holder[rightChild[i]]+=1;
                if(holder[rightChild[i]]>1){
                    return false;
                }
                if(rightChild[i]<i){
                    return false;
                }
            }
        }
        return true;

    }


}
