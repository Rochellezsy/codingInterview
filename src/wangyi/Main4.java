package wangyi;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Main4 {
    public int[][] search(int[][]nums, int n, int m){
        int[][]dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(nums[i][j]==0){
                    dp[i][j]=0;
                }else{
                    dp[i][j]=n*m;
                }
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i>0){
                    dp[i][j]=Math.min(dp[i-1][j]+1,dp[i][j]);
                }
                if(i<n-1){
                    dp[i][j]=Math.min(dp[i+1][j]+1,dp[i][j]);
                }
                if(j>0){
                    dp[i][j]=Math.min(dp[i][j-1]+1,dp[i][j]);
                }

                if(j<m-1){
                    dp[i][j]=Math.min(dp[i][j+1]+1,dp[i][j]);
                }
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                if(i>0){
                    dp[i][j]=Math.min(dp[i-1][j]+1,dp[i][j]);
                }
                if(i<n-1){
                    dp[i][j]=Math.min(dp[i+1][j]+1,dp[i][j]);
                }
                if(j>0){
                    dp[i][j]=Math.min(dp[i][j-1]+1,dp[i][j]);
                }

                if(j<m-1){
                    dp[i][j]=Math.min(dp[i][j+1]+1,dp[i][j]);
                }
            }
        }

        return dp;
    }

    public static void main(String[] args) {
        Main4 t1=new Main4();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        String[]t=new String[n+1];

        int[][]nums=new int[n][m];
        int[][]dp;



        for(int i=0;i<n;i++){
            t[i]=scanner.next();
            for(int j=0;j<m;j++){
                nums[i][j]= Integer.parseInt(String.valueOf(t[i].charAt(j)));
            }
        }


        dp=t1.search(nums,n,m);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(dp[i][j]);
                if(j!=m-1){
                    System.out.print(" ");
                }
            }
            if(i!=n-1){
                System.out.println();
            }
        }

    }
}
