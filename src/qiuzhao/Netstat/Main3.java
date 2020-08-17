package qiuzhao.Netstat;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main3 {
    public String time(int n, int[]a, int[]b){
        String ans = "";
        int[]dp = new int[n];
        dp[0]=a[0];
        if(n >= 2){
            dp[1] = Math.min(dp[0]+a[1], b[1]);
        }
        for(int i=2; i<n; i++){
            dp[i] = Math.min(dp[i-1]+a[i], dp[i-2]+b[i]);
        }
        int seconds = 100;

        int hours = seconds/60/60;
        int minutes = (seconds/60)%60;
        int remainseconds = seconds%60;

        int h = hours+8;
        int m = minutes;
        int s = remainseconds;
        DecimalFormat df = new DecimalFormat("00");
        if(h>=12){
            ans = ans.concat(df.format(h/12)).concat(":").concat(df.format(m)).concat(":").concat(df.format(s)).concat(" pm");
        }
        else{
            ans = ans.concat(df.format(h)).concat(":").concat(df.format(m)).concat(":").concat(df.format(s)).concat(" am");
        }
        return ans;

    }

    public static void main(String[] args) {
        Main3 test = new Main3();
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();
        String[]res = new String[T];
        for(int i=0; i<T; i++){
            int n = scanner.nextInt();
            int[]a = new int[n];
            int[]b = new int[n];
            for(int j=0; j<n; j++){
                a[j]=scanner.nextInt();
            }
            b[0]=0;
            for(int k=1; k<=n-1; k++){
                b[k]=scanner.nextInt();
            }
            res[i] = test.time(n, a, b);
        }
        for(String s: res){
            System.out.println(s);
        }
    }
}
