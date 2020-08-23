package Google.kickstart.RoundE_2020;

import java.util.*;
import java.io.*;
public class Solution2 {
    public String high(int N, int A, int B, int C){
        int left = A - C;
        int right = B - C;
        if(left+C+right>N) {
            return "IMPOSSIBLE";
        }
        if(N!=1 && left==0 && right==0 && C==1){
            return "IMPOSSIBLE";
        }
        int[]ans = new int[N];
        if(N==2){
            if(left==1 && right==0){
                ans[0]=1;
                ans[1]=2;
            }
            else if(left==0 && right==1){
                ans[0]=2;
                ans[1]=1;
            }
            else {
                ans[0]=2;
                ans[1]=2;
            }
        }
        else{
            if (C>=2){
                for(int i=0; i<left; i++){
                    if(i+2<N){
                        ans[i]=i+2;
                    }
                    else{
                        ans[i]=N-1;
                    }
                }
                int begin = left;
                for(int i=0; i<right; i++){
                    if(i+2<N){
                        ans[N-i-1]=i+2;
                    }
                    else{
                        ans[N-i-1]=N-1;
                    }
                }
                int end = N-right-1;
                ans[begin] = N;
                ans[end] = N;
                int remain = C-2;
                for(int i=begin+1; i<=end-1; i++){
                    if(remain>0){
                        ans[i] = N;
                        remain--;
                    }
                    else{
                        ans[i]=1;
                    }
                }
            }
            else if(C==1){
                int begin = left;
                int end = N-right-1;
                for(int i=0; i<left; i++){
                    if(i+2<N){
                        ans[i]=i+2;
                    }
                    else{
                        ans[i]=N-1;
                    }
                }
                for(int i=0; i<right; i++){
                    if(i+2<N){
                        ans[N-i-1]=i+2;
                    }
                    else{
                        ans[N-i-1]=N-1;
                    }
                }
                if(left>=right){
                    for(int i=begin; i<=end-1; i++){
                        ans[i]=1;
                    }
                    ans[end]=N;
                }
                else{
                    ans[begin]=N;
                    for(int i=begin+1; i<=end; i++){
                        ans[i]=1;
                    }
                }
            }
        }

        StringBuilder res=new StringBuilder();
        for(int i=0; i<N-1; i++){
            res.append(ans[i]);
            res.append(" ");
        }
        res.append(ans[N-1]);
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Solution2 test = new Solution2();
//        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
//        for (int i = 1; i <= t; ++i) {
//            int N = in.nextInt();
//            int A = in.nextInt();
//            int B = in.nextInt();
//            int C = in.nextInt();
//            System.out.println("Case #" + i + ": " + test.high(N, A, B, C));
//        }

        System.out.println("Case #" + 1 + ": " + test.high(3, 3, 1, 1));
    }
}

