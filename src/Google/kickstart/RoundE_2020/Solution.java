package Google.kickstart.RoundE_2020;

import java.util.*;
import java.io.*;
public class Solution {
    public int longestArr(int n, int[]a){
        if(a.length==2) return 2;
        int avg = a[1]-a[0];
        int ans = 2;
        int count =2;
        for(int i=2; i<n; i++){
            if(a[i]-a[i-1]==avg){
                count++;
                ans= Math.max(count, ans);
            }
            else{
                count = 2;
                avg = a[i]-a[i-1];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Solution test = new Solution();
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int[]a = new int[n];
            for(int j=0; j<n; j++){
                a[j] = in.nextInt();
            }
            System.out.println("Case #" + i + ": " + test.longestArr(n, a));
        }
    }
}
