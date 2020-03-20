package Meituan;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public int score(int m,int p, int q,int k,int n,int[] nums){
        int score=0;
        int sumtime=0;
        Arrays.sort(nums);
        int mintime=nums[0];
        for(int num:nums){
            sumtime+=num;
        }
        if(m>=n*sumtime){
            score=n*k*p+n*q;
        }
        else if(m<mintime){
            score=0;
        }
        else if(m>mintime && m<sumtime){
            int count=m/mintime;
            if(count>n)count=n;
            score=count*p;
        }
        else if(m>sumtime){
            int ans1=0;
            int m1=m;
            int m2=m;
            int count=m1/sumtime;
            m1=m1-count*sumtime;
            ans1=count*(k*p+q);
            for(int i=0;i<k;i++){
                if(n-count>m1/nums[i]){
                    ans1+=(m1/nums[i])*p;

                }
                else if(n-count<m1/nums[i]){
                    ans1+=(n-count)*p;
                    m1=m1-(n-count)*nums[i];
                }
            }

            int ans2=0;
            for(int i=0;i<k;i++){
                if(i==k-1){
                    int c=m2/nums[i];
                    ans2=c*(p+q);
                    break;
                }
                if(n*nums[i]<m2){
                    m2=m2-n*nums[i];
                    ans2+=n*p;
                }
                else if(n*nums[i]>m2){
                    int c=m2/nums[i];
                    ans2+=c*p;
                    break;
                }
            }
            if(ans1>=ans2){
                score=ans1;
            }
            else {
                score=ans2;
            }

        }

        return score;
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int m=scanner.nextInt();
        int p=scanner.nextInt();
        int q=scanner.nextInt();
        int[]nums=new int[k];
        for(int i=0;i<k;i++){
            nums[i]=scanner.nextInt();
        }
        Main main=new Main();
        System.out.println(main.score(m,p,q,k,n,nums));

    }
}
