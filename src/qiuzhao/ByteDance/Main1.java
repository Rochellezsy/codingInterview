package qiuzhao.ByteDance;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    String ans = "";
    public boolean kmp(String str) {
        int n = str.length();
        int[] fail = new int[n];
        Arrays.fill(fail, -1);
        for (int i = 1; i < n; ++i) {
            int j = fail[i - 1];
            while (j != -1 && str.charAt(j + 1) != str.charAt(i)) {
                j = fail[j];
            }
            if (str.charAt(j + 1) == str.charAt(i)) {
                fail[i] = j + 1;
            }
        }
        if(fail[n - 1] != -1 && n % (n - fail[n - 1] - 1) == 0){
            ans = str.substring(0, n - fail[n - 1] - 1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main1 test = new Main1();
        String str = scanner.next();
        if(!test.kmp(str)){
            System.out.println(str);
        }
        else{
            System.out.println(test.ans);
        }
    }
}
