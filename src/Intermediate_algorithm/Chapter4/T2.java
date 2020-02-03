package Intermediate_algorithm.Chapter4;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    List<String>list=new ArrayList<>();

    public void back(String combination,int left,int right){
        if(right<left|| left<0 || right<0)return;
        if(left==0 && right==0){
            list.add(combination);
        }


        String addleft="(";
        back(combination+addleft,left-1,right);
        String addright=")";
        back(combination+addright,left,right-1);
    }

    public List<String> generateParenthesis(int n) {
        if(n>=1){
            back("(",n-1,n);
        }
        return list;
    }
}
