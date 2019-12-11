public class T2 {
    public int[] multiply(int[] A) {
        int len=A.length;
        int[] B=new int[len];
        for(int i=0;i<len;i++){
            int ans=1;
            for(int j=0;j<len;j++){
                if(i==j){
                    continue;
                }
                ans=ans*A[j];
            }
            B[i]=ans;
        }
        return B;

    }
}
