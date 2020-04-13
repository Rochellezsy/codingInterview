package chunzhao.Zhaohang;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int panduan(int[]nums){
        Arrays.sort(nums);
        int len=nums.length;
        int count=0;
        for(int num: nums){
            if(num==0)count++;
        }
        if(len==0)return -1;
        if(len==1 && nums[0]>=2)return 2;
        if(len>=2){
            if(nums[nums.length-1]<=1){
                return -1;
            }
        }

        return nums.length-count+1;
    }

    public static void main(String[] args) {
        Main t1=new Main();
        Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        int[]res=new int[T];
        int index=0;
        while(T>0){
            int n=scanner.nextInt();
            int []nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=scanner.nextInt();
            }
            res[index]=t1.panduan(nums);
            T--;
            index++;
        }
        for(int r:res){
            System.out.println(r);
        }

    }

}
