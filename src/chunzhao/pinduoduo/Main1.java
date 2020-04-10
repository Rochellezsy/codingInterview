package chunzhao.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public long spend(int[]A, int N){
        long sum=0;
        if(N%3==0){
            for(int i=0; i<N; i++){
                if(i%3==0){
                    continue;
                }
                sum+=A[i];
            }
            return sum;
        }
        else if(N%3==1){
            sum+=A[0];
            for(int i=1; i<N; i++){
                if(i%3==1){
                    continue;
                }
                sum+=A[i];
            }
        }
        else if(N%3==2){
            sum+=A[0]+A[1];
            for(int i=2; i<N; i++){
                if(i%3==2){
                    continue;
                }
                sum+=A[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[]A=new int[N];
        for(int i=0; i<N; i++){
            A[i]=scanner.nextInt();
        }
        Arrays.sort(A);

        System.out.println(new Main1().spend(A,N));
    }
}
