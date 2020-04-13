package Leetcode_Emphases.Chapter4;

public class P2 {
    public String addStrings(String num1, String num2) {
        StringBuilder res=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int a=i>=0?num1.charAt(i)-'0':0;
            int b=j>=0?num2.charAt(j)-'0':0;
            int temp=a+b+carry;
            carry=temp/10;
            res.append(temp%10);
            i--;
            j--;
        }
        if(carry==1)res.append(1);
        return res.reverse().toString();
    }
}
