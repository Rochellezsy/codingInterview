package Primary_algorithm.Chapter6;

public class T2_1 {
    public int maxProfit(int[] prices) {
        if(prices.length==0)return 0;
        int[]dp=new int[prices.length];
        dp[0]=0;

        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]+dp[i-1]<0){
                dp[i]=0;
            }
            else {
                dp[i]=prices[i]-prices[i-1]+dp[i-1];
            }
        }

        int ans=0;
        for(int i=0;i<dp.length;i++){
            if(dp[i]>ans){
                ans=dp[i];
            }
        }
        return ans;

    }
}
