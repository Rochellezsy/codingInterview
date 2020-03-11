import java.util.Scanner;

public class P1013 {
    public boolean canThreePartsEqualSum(int[] A) {
        if(A.length<3)return false;
        int ans=0;
        for(int i=0;i<A.length;i++){
            ans+=A[i];
        }
        if(ans%3!=0)return false;
        int res=ans/3;

        int left=0;
        int right=A.length-1;
        int l=0;
        int r=0;
        while(left+1<=right){
            if(l!=res) {
                l += A[left];
                left++;
            }

            if(r!=res){
                r+=A[right];
                right--;
            }
            if(l==res && r==res && left+1<=right)return true;

        }
        return false;

    }

    public static void main(String[] args) {

        int[]nums={3,3,6,5,-2,2,5,1,-9,4};


        System.out.println(new P1013().canThreePartsEqualSum(nums));
    }
}
