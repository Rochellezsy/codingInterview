package wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public int shulie(int[]nums){
        int[]arr=new int[nums.length-1];
        for(int i=1;i<nums.length;i++){
            arr[i-1]=nums[i]-nums[i-1];
        }
        Arrays.sort(arr);
        int ans=arr[0];
        if(ans==0)return -1;
        while(ans>1){
            for(int i=0;i<arr.length;i++){
                if(arr[i]%ans!=0){
                    ans--;
                    break;
                }
            }
            return ans;
        }
        return -1;
    }


    public static void main(String[] args) {
        Main1 t1=new Main1();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=scanner.nextInt();
        }
        System.out.println(t1.shulie(nums));
    }
}
