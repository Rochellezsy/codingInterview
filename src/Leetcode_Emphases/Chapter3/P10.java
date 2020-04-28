package Leetcode_Emphases.Chapter3;

import java.util.Arrays;

public class P10 {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int stone: stones){
            sum+=stone;
        }
        int capacity=sum/2;
        int[]dp=new int[capacity+1];
        for(int i=0; i<stones.length; i++){
            for(int j=capacity; j>=stones[i]; j--){
                dp[j]=Math.max(dp[j],dp[j-stones[i]]+stones[i]);
            }
        }
        return sum-2*dp[capacity];
    }

    public static void main(String[] args) {
        int[]nums={2,7,4,1,8,1};
        System.out.println(new P10().lastStoneWeightII(nums));
    }
}
