package Google.kickstart.RoundD_2020;

import java.util.*;
import java.io.*;
public class Solution1 {
    public int count(int[]num){
        int n = num.length;
        int[]dp=new int[n];
        int ans = 0;
        dp[0]=num[0];
        if(n>1 && num[1]<num[0]){
            ans++;
        }
        for(int i=1; i<n; i++){
            if(num[i]>dp[i-1]) {
                dp[i] = num[i];
                if(i!=n-1 && num[i]>num[i+1]){
                    ans++;
                }
            }
            else {
                dp[i] = dp[i-1];
            }
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
            System.out.println("Case #" + i + ": " + new Solution1().count(num));
        }
    }
}
