package Intermediate_algorithm.Chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T1 {
    List<String>list=new ArrayList<>();
    public void back(String combination,String nextdigits){
        HashMap<String,String> map=new HashMap<>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");

        if(nextdigits.length()==0){
            list.add(combination);
        }
        else {
            String number=nextdigits.substring(0,1);
            String numberString=map.get(number);

            for(int i=0;i<numberString.length();i++){
                String add=numberString.substring(i,i+1);
                String next=nextdigits.substring(1);
                back(combination+add,next);
            }
        }
    }





    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0){
            back("",digits);
        }
        return list;

    }
}
