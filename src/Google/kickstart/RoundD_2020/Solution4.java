package Google.kickstart.RoundD_2020;
import java.util.*;
import java.io.*;

public class Solution4 {
    public int count(int n, int[]num, int start, int k, boolean[] lock, boolean[] flag){
        if(k==1){
            return start;
        }
        flag[start - 1] = true;
        if(start ==1){
            if(!lock[start-1]) {
                lock[start-1] = true;
                return count(n, num, start + 1, k - 1, lock, flag);
            }
            else{
                for(int i=0; i<lock.length;i++){
                    if(lock[i]){
                        if(!flag[i]){
                            return count(n, num, i, k-1, lock, flag);
                        }
                        else if(!flag[i+1]){
                            return count(n, num, i+1, k-1, lock, flag);
                        }
                    }
                }
            }
        }
        else if(start == n){
            if(!lock[start-2]){
                lock[start-2] = true;
                return count(n, num, start-1, k-1, lock, flag);
            }
            else{
                for(int i=0; i<lock.length;i++){
                    if(lock[i]){
                        if(!flag[i]){
                            return count(n, num, i, k-1, lock, flag);
                        }
                        else if(!flag[i+1]){
                            return count(n, num, i+1, k-1, lock, flag);
                        }
                    }
                }
            }
        }
        else{
            if(lock[start-1]){
                if(!flag[start]){
                    return count(n, num, start+1, k-1, lock, flag);
                }
            }
            else if(lock[start-2]){
                if(!flag[start-1]){
                    return count(n, num, start-1, k-1, lock, flag);
                }
            }
            else if(!lock[start-2] && !lock[start-1]){
                if(num[start-2]<=num[start-1]) {
                    lock[start - 2] = true;
                    return count(n, num, start - 1, k - 1, lock, flag);
                }
                else{
                    lock[start-1] = true;
                    return count(n, num, start + 1, k - 1, lock, flag);
                }
            }

        }
        return 0;
    }






    public static void main(String[] args) {
        int[] num= {90, 30, 40, 60};
        boolean[]flag=new boolean[5];
        boolean[]lock=new boolean[4];
        System.out.println(new Solution4().count(5,num, 3, 4, lock, flag));
//        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
//        Solution4 main=new Solution4();
//        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
//        for (int i = 1; i <= t; ++i) {
//            int n = in.nextInt();
//            int q = in.nextInt();
//            int[]D = new int[n-1];
//            for(int j=0; j<n-1; j++){
//                D[j] = in.nextInt();
//            }
//            int res[] = new int[q];
//            for(int k=0; k<q; k++){
//                int S = in.nextInt();
//                int K = in.nextInt();
//                boolean[]flag=new boolean[n];
//                boolean[]lock=new boolean[n-1];
//                res[k] = main.count(n, D, S, K, lock, flag);
//            }
//            System.out.println("Case #" + i + ": " + Arrays.toString(res));
//        }
    }
}
