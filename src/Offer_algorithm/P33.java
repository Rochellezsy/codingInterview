package Offer_algorithm;

import java.util.Arrays;

public class P33 {
    public boolean verifyPostorder(int[] postorder) {
        if(postorder.length==0 ||postorder.length==1)return true;
        int len=postorder.length-1;
        int i=0;
        while(postorder[i]<postorder[len]){
            i++;
        }
        int j=i;
        while(j<len){
            if(postorder[j]<postorder[len]){
                return false;
            }
            j++;
        }
        return verifyPostorder(Arrays.copyOfRange(postorder,0,i)) && verifyPostorder(Arrays.copyOfRange(postorder,i,postorder.length-1));
    }

    public static void main(String[] args) {
        int[] arr={1,3,2,6,5};
        P33 test=new P33();
        System.out.println(test.verifyPostorder(arr));

    }

}
