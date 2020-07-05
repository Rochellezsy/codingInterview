package Google.kickstart.RoundB_2018;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Solution1 {

    public BigInteger solve(BigInteger F, BigInteger L){
        return count(L).subtract(count(F)).add(BigInteger.valueOf(1));
    }

    public BigInteger count(BigInteger N){
        BigInteger ans = new BigInteger(String.valueOf(0));
        String s = String.valueOf(N);
        int len = s.length();
        for(int i =0; i<len-1; i++){
            BigInteger a=BigInteger.valueOf(s.charAt(i) - '0').multiply(BigInteger.valueOf(8)).multiply(BigInteger.valueOf(9).pow(len-2-i));
            ans = ans.add(a);
        }
        BigInteger start = N.subtract(BigInteger.valueOf(s.charAt(len-1) - '0'));
        while (start.compareTo(N)<=0){
            if(!start.mod(BigInteger.valueOf(9)).equals(BigInteger.valueOf(0))){
                ans = ans.add(BigInteger.valueOf(1));
            }
            start = start.add(BigInteger.valueOf(1));

        }
        return ans;
    }

    public static void main(String[] args) {
        Solution1 main = new Solution1();
//        System.out.println(main.count(1000000000000L));

        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = in.nextInt(); // Scanner has functions to read ints, longs, strings, chars, etc.
        for (int i = 1; i <= t; ++i) {
            String f = in.next();
            String l = in.next();
            BigInteger F = new BigInteger(f);
            BigInteger L = new BigInteger(l);
            System.out.println("Case #" + i + ": " + main.solve(F, L));
        }
    }
}
