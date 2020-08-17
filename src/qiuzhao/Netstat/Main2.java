package qiuzhao.Netstat;

import chunzhao.Saima_Test.Main;

import java.util.Scanner;

public class Main2 {
    public long count(long[]nums){
        long ans = 0;
        for(long num: nums){
            if(num<2){
                continue;
            }
            ans += num/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Main2 test = new Main2();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long[]nums=new long[n];

        for(int i=0;i<n;i++){
            nums[i]=scanner.nextLong();
        }
        System.out.println(test.count(nums));
    }
}
