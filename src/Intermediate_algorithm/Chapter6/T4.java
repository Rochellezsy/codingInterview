package Intermediate_algorithm.Chapter6;

import java.util.Arrays;

public class T4 {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0)return 0;
        int[] dp=new int[nums.length];
        int n=nums.length;
        Arrays.fill(dp,1);

        dp[0]=1;

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    int curr=dp[j]+1;
                    dp[i]=Math.max(curr,dp[i]);
                }
            }
        }

        int max=dp[0];
        for(int i=1;i<dp.length;i++){
            if(dp[i]>max){
                max=dp[i];
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[]nums={10,9,2,5,3,7,101,18};
        T4 test=new T4();
        test.lengthOfLIS(nums);
    }
}
