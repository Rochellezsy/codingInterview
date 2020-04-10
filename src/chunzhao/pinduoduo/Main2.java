package chunzhao.pinduoduo;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public int shuliang(int N, int M, int[]A){
        int count=0;
        for(int i=1; i<=N; i++){
            for(int j=0; j<N; j++){
                long ans=0;
                int temp=i;
                int index=j;
                while(temp>0 && i+j<=N){
                    ans += A[index];
                    index++;
                    temp--;
                }
                if(ans!=0 && ans%M==0){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int M=scanner.nextInt();
        int[]A=new int[N];
        for(int i=0; i<N; i++){
            A[i]=scanner.nextInt();
        }
        System.out.println(new Main2().shuliang(N, M, A));
    }
}
