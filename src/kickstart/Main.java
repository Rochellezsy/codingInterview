package kickstart;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int count(int[]arr, int B){
        Arrays.sort(arr);
        int count=0;
        int ans=0;

        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
            if(ans<=B){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Main t1=new Main();
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[]res=new int[N];
        int index=0;
        while(N>0){
            int M=scanner.nextInt();
            int B=scanner.nextInt();
            int[]arr=new int[M];
            for(int i=0;i<M;i++){
                arr[i]=scanner.nextInt();
            }
            res[index]=t1.count(arr,B);
            index++;
            N--;
        }

        for(int i=0; i<res.length;i++){
            System.out.println("Case #"+(i+1)+":"+res[i]);
        }

    }
}
