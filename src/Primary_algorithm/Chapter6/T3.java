package Primary_algorithm.Chapter6;

import java.awt.event.MouseAdapter;

//dp
public class T3 {
    public int maxSubArray(int[] nums) {
        /*
        int[]dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
        }
        int res=dp[0];
        for(int i=0;i<dp.length;i++){
            if(dp[i]>res){
                res=dp[i];
            }
        }
        return res;

         */
        int res=nums[0];
        int ans=Integer.MIN_VALUE;

        for(int i=1;i<nums.length;i++){
            if(res>0){
                res=res+nums[i];
            }
            else {
                res=nums[i];
            }
            ans=Math.max(ans,res);
        }
        return ans;

    }
}
