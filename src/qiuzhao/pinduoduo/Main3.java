package qiuzhao.pinduoduo;

import java.util.Scanner;

public class Main3 {
    public int maxProfit(int N, int M, int[]C, int[]V){
        int[]dp =new int[M+1];
        for(int i=0; i<N; i++){
            for(int j=M; j>=0; j--){
                if(j>=C[i]){
                    dp[j] = Math.max(dp[j], dp[j-C[i]]+V[i]);
                }
            }
        }
        return dp[M];
    }


    public static void main(String[] args) {
        Main3 test=new Main3();
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[]C = new int[N];
        int[]V = new int[N];
        for(int i=0; i<N; i++){
            C[i] = scanner.nextInt();
            V[i] = scanner.nextInt();
        }
        System.out.println(test.maxProfit(N, M, C, V));

    }
}
