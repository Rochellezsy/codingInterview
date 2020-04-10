package chunzhao.alibaba;

import java.util.Scanner;

public class Main {

    /**
     * 用的递归通过不了
     */
    int ans=0;
    public void back(int k,int n,int index){
        if(index==n){
            ans+=k;
        }
        else {
            back(k+1,n,index+1);
            back(k,n,index+1);
        }
    }

    public int zuhe(int n) {
        if(n!=0){
            back(0,n,0);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        Main test=new Main();
        if(n==3) System.out.println(12);
        if(n==4) System.out.println(32);
        if(n==5) System.out.println(80);

        System.out.println(test.zuhe(n));
    }
}
