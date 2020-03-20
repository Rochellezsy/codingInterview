package Meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {

    public long panduan(int[]nums1, int[]nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int len1=nums1.length;
        int len2=nums2.length;
        long ans1=nums1[len1-1]+nums1[len1-2]+nums1[len1-3];
        long ans2=nums2[len2-1]+nums2[len2-2]+nums2[len2-3];
        if(ans1>=ans2){
            return ans1;
        }
        return ans2;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt();
        int[]nums1=new int[m];
        int[]nums2=new int[m];
        for(int i=0;i<m;i++){
            nums1[i]=scanner.nextInt();
        }
        for(int i=0;i<m;i++){
            nums2[i]=scanner.nextInt();
        }

        if(m<3){
            long res1=0;
            for(int nums:nums1){
                res1+=nums;
            }
            long res2=0;
            for(int nums:nums2){
                res2+=nums;
            }
            if(res1>=res2){
                System.out.println(res1);
            }
            else {
                System.out.println(res2);
            }
            System.out.println(0);

        }
        else{
            Main1 main1=new Main1();
            System.out.println(main1.panduan(nums1,nums2));
        }

    }
}
