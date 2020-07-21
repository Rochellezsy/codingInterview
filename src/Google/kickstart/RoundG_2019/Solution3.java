package Google.kickstart.RoundG_2019;

import Google.kickstart.RoundD_2020.Solution4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Solution3 {
    int ans = 0;

    public void count(int index, int N, long suma, long sumb, long H, int[]A, int[]B){
        if(index == N){
            if(suma >= H && sumb>=H){
                ans++;
            }
            return;
        }
        count(index+1, N, suma+A[index], sumb, H, A, B);
        count(index+1, N, suma, sumb+B[index], H, A, B);
        count(index+1, N, suma+A[index], sumb+B[index], H, A, B);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            long h = in.nextLong();
            int []a = new int[n];
            int []b = new int[n];
            for(int x = 0; x < n; x++){
                a[x] = in.nextInt();
            }
            for(int y = 0; y < n; y++){
                b[y] = in.nextInt();
            }
            Solution3 test=new Solution3();
            test.count(0, n, 0, 0, h, a, b);

            System.out.println("Case #" + i + ": " + test.ans);
        }
    }
}
