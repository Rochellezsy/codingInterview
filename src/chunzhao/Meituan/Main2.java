package chunzhao.Meituan;

import java.util.Scanner;

public class Main2 {
    public int judge(int[]nums,int index){
        int ans=0;
        int a=0;
        for(int i=0;i<nums.length-1;i++){
            if(i==index-1 && i!=nums.length-2){
                if(nums[i]<nums[i+2]){
                    a++;
                }
            }
            else if(i==index){
                continue;
            }
            else if(nums[i]<nums[i+1]){
                a++;
                if(a>ans){
                    ans=a;
                }
            }
            else if(nums[i]>=nums[i+1]){
                a=0;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Main2 main2=new Main2();
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int[]arr=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=scanner.nextInt();
        }

//        int[]arr={2,1,3,2,5};

//        System.out.println(main2.judge(arr,2));
        int res=main2.judge(arr,0);
        int index=0;

        for(int i=1;i<arr.length;i++){

            if(i!=arr.length-1 && arr[i-1]<arr[i+1]){
                int temp=main2.judge(arr,i);
                if(temp>res){
                    res=temp;
                    index=i;
                }
            }
        }
        System.out.println(arr[index]);

    }
}
