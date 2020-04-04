public class P887 {
    public int superEggDrop(int K, int N) {
        int[]dp=new int[K+1];
        int ans=0;
        while(dp[K]<N){
            for(int i=K; i>0; i--){
                dp[i]=dp[i-1]+dp[i]+1;
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new P887().superEggDrop(3,14));
    }
}
