package qiuzhao.Baidu;

import java.util.Scanner;

public class Main3 {
    public int numWays(int n, int m) {
        if(m == 0)return 0;
        int[][]dp = new int[n+1][m+1];
        dp[0][0] = 1;
        dp[1][0] = 0;
        dp[1][1] = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i-j>0){
                    for(int k=1; k<=m; k++){
                        if(k!=j && i-j>0){
                            if(i-j-k>=0){
                                dp[i][j] += dp[i-j][k] - dp[i-j-k][j];
                            }
                            else{
                                dp[i][j] += dp[i-j][k];
                            }
                        }
                    }
                }
                else{
                    dp[i][j] = 1;
                }
            }
        }
        int ans = 0;
        for(int i=1; i<=m; i++){
            ans+=dp[n][i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Main3 test =new Main3();
        System.out.println(test.numWays(2, 2));
//        Scanner scanner=new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        System.out.println(test.numWays(n, m));
    }
}
