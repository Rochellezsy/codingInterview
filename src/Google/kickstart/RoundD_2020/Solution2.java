package Google.kickstart.RoundD_2020;
import java.util.*;
import java.io.*;

public class Solution2 {
    public int count(int[]num){
        int n=num.length;
        int[][] dp=new int[n][4];
        for(int i=1; i<n; i++){
            for (int j = 0; j < 4; j++) {
                dp[i][j] = n;
                for (int k = 0; k < 4; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + 1);
                    if (num[i] > num[i - 1] && j > k)
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][k]);
                    if (num[i] < num[i - 1] && j < k)
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][k]);
                    if (num[i] == num[i - 1] && j == k)
                        dp[i][j] = Math.min(dp[i][j], dp[i - 1][k]);
                }
            }
        }
        int ans = dp[n-1][0];
        for (int j = 0; j < 4; j++) {
            ans = Math.min(ans, dp[n-1][j]);
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int[]num = new int[n];
            for(int j=0; j<n; j++){
                num[j] = in.nextInt();
            }
            System.out.println("Case #" + i + ": " + new Solution2().count(num));
        }
    }
}
