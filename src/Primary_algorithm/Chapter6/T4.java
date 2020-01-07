package Primary_algorithm.Chapter6;


public class T4 {
    public int rob(int[] nums) {
        int len=nums.length;
        if(len==0) return 0;
        if(len==1) return nums[0];
        if(len==2) return Math.max(nums[0],nums[1]);
        if(len>2){
            int[] dp=new int[len];
            dp[0]=nums[0];
            dp[1]=Math.max(nums[0],nums[1]);
            int ans=0;
            for(int i=2;i<nums.length;i++){
                if(ans<dp[i-2]){
                    ans=dp[i-2];
                }
                dp[i]=ans+nums[i];
            }
            int res=0;
            for(int i=0;i<dp.length;i++){
                if(res<dp[i]){
                    res=dp[i];
                }
            }
            return res;
        }
        return 0;


    }
}
