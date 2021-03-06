package Intermediate_algorithm.Chapter4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T1_1 {
    List<String>res=new ArrayList<>();
    public void back(String combinations,String nextdigits) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");

        if(nextdigits.length()==0){
            res.add(combinations);
        }
        else {
            String number=nextdigits.substring(0,1);
            String numberstring=map.get(number);
            for(int i=0;i<numberstring.length();i++){
                String add=numberstring.substring(i,i+1);
                String next=nextdigits.substring(1);
                back(combinations+add,next);
            }
        }

    }
    public List<String> letterCombinations(String digits) {
        if(digits.length()!=0){
            back("",digits);
        }
        return res;
    }

}
