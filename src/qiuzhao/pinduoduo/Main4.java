package qiuzhao.pinduoduo;

import java.util.HashSet;
import java.util.Scanner;

public class Main4 {
    public int count(int N, int[]num){
        int count =0;
        for(int i = 1; i<=N; i++){
            for(int j=0; j<num.length; j++){
                if(i%num[j]==0){
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main4 test = new Main4();
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[]num = new int[M];
        for(int i=0; i<M; i++){
            num[i]=scanner.nextInt();
        }
        System.out.println(test.count(N, num));
    }
}
