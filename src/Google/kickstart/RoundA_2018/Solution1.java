package Google.kickstart.RoundA_2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution1 {
    public long getpre(long n){
        long ans = 0;
        int[]num = new int[20];
        int index=0;
        while(n!=0){
            num[index]= (int) (n%10);
            index++;
            n=n/10;
        }

        for(int i=index-1; i>=0; i--){
            if(num[i]%2 == 0){
                ans = ans*10+num[i];
            }
            else{
                ans = ans*10+(num[i]-1);
                int j = i-1;
                while(j>=0){
                    ans = ans*10+8;
                    j--;
                }
                break;
            }
        }
        return ans;
    }

    public long getnext(long n){
        long ans=0;
        int[]num = new int[20];
        int index=0;
        while(n!=0){
            num[index]=(int)(n%10);
            index++;
            n=n/10;
        }
        num[index++]=0;

        for(int i=index-1; i>=0; i--){
            if(num[i]%2 == 0){
                ans = ans*10+num[i];
            }
            else{
                if(num[i]!=9){
                    ans = ans*10+(num[i]+1);
                    int j = i-1;
                    while(j>=0){
                        ans = ans*10;
                        j--;
                    }
                    break;
                }
                else{
                    int count=0;
                    while (ans %10 == 8){
                        count++;
                        ans = ans/10;
                    }
                    ans = ans+2;
                    while(count>=0){
                        ans=ans*10;
                        count--;
                    }
                    int j = i-1;
                    while(j>=0){
                        ans = ans*10;
                        j--;
                    }
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution1().getpre(12422886));
//        System.out.println(new Solution1().getnext(4249231));

        Solution1 main = new Solution1();
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            long n = in.nextLong();
            System.out.println("Case #" + i + ": " + Math.min(n-main.getpre(n), main.getnext(n)-n));
        }
    }
}
