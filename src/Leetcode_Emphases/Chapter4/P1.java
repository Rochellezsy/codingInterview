package Leetcode_Emphases.Chapter4;

import java.util.SplittableRandom;

public class P1 {
    private final String[] big={"", "Thousand", "Million", "Billion"};
    private final String[] less_twenty={"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] shi={"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    public String numberToWords(int num) {
        if(num==0)return "Zero";
        StringBuilder ans=new StringBuilder();
        int index=0;
        while(num>0){
            if(num%1000!=0){
                StringBuilder temp=new StringBuilder();
                helper(num%1000, temp);
                ans.insert(0, temp.append(big[index]).append(" "));
            }
            index++;
            num=num/1000;
        }
        return ans.toString().trim();

    }

    public void helper(int num, StringBuilder temp){
        if(num==0)return;
        if(num<20){
            temp.append(less_twenty[num]).append(" ");
        } else if(num<100){
            temp.append(shi[num/10]).append(" ");
            helper(num%10, temp);
        } else {
            temp.append(less_twenty[num/100]).append(" Hundred").append(" ");
            helper(num%100, temp);
        }
    }
}
