package qiuzhao.oppo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public List<String> getSubstrings(String s) {
        // 动态规划法
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        List<String>list = new ArrayList<>();
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    if(i!=j){
                        String temp = s.substring(i, j+1);
                        //结果去重
                        if(!list.contains(temp)){
                            list.add(temp);
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main1 test = new Main1();
        String s = scanner.next();
        List<String> list = test.getSubstrings(s);
        for (String l : list) {
            System.out.println(l);
        }
    }
}
