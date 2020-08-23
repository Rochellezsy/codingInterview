package Google.kickstart.RoundE_2020;
import java.util.*;
import java.io.*;

public class Solution3 {
    public String Toys(int n, int[]e, int[]r){
        int ans=0;
        StringBuilder res=new StringBuilder();
        if(n==1){
            res.append(0);
            res.append(" ");
            res.append(e[0]);
        }
        else {

        }

        return res.toString();

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        Solution3 test = new Solution3();
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            int n = in.nextInt();
            int[]e = new int[n];
            int[]r = new int[n];
            for(int j=0; j<n; j++){
                e[j] = in.nextInt();
                r[j] = in.nextInt();
            }
            System.out.println("Case #" + i + ": " + test.Toys(n, e, r));
        }
    }
}
