package qiuzhao.Alibaba;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public int getres(int[]nums){
        Arrays.sort(nums);
        return gettime(nums, nums.length);
    }

    public int gettime(int[]nums, int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return nums[0];
        }
        else if(n==2){
            return nums[1];
        }
        else if(n==3){
            return nums[0]+nums[1]+nums[2];
        }
        else{
            if(2*nums[1] > nums[0]+nums[n-2]){
                return 2*nums[0] + nums[n-1]+nums[n-2]+ gettime(nums, n-2);
            }
            else{
                return 2*nums[1]+nums[n-1]+nums[0]+ gettime(nums, n-2);
            }
        }
    }

    public static void main(String[] args) {
        Main test=new Main();
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();
        int[]ans=new int[T];
        for(int t=0; t<T; t++){
            int n=scanner.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
            }
            ans[t] = test.getres(a);
        }
        for(int an:ans){
            System.out.println(an);
        }
    }
}
