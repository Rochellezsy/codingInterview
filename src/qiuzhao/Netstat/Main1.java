package qiuzhao.Netstat;

import java.util.Scanner;

public class Main1 {
    public boolean judge(String s, int i, int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public String printans(String s){
        int n = s.length()-1;
        if(judge(s, 0, n)){
            return s;
        }
        String res = "";
        int index = n-1;
        StringBuilder ans = new StringBuilder();
        int i = n-1;
        while(i>=0){
            if(judge(s, i, n)){
                index = i;
            }
            i--;
        }
        index--;
        while(index>=0){
            ans.append(s.charAt(index));
            index--;
        }
        res = s.concat(ans.toString());

        return res;
    }

    public static void main(String[] args) {
        Main1 t1=new Main1();
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        System.out.println(t1.printans(s));
    }
}
