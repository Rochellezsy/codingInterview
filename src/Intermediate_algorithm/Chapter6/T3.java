package Intermediate_algorithm.Chapter6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T3 {
    List<List<Integer>>res=new ArrayList<>();

    public void back(int sum,int[]coins, int amount, List<Integer>list){
        if(sum==amount){
            Collections.sort(list);
            if(!res.contains(list)){
                res.add(list);
            }
        }
        else if(sum<amount){
            for(int i=0;i<coins.length;i++){
                List<Integer>templist=new ArrayList<>(list);
                templist.add(coins[i]);
                back(sum+coins[i],coins,amount,templist);
            }
        }
    }

    public int coinChange(int[] coins, int amount) {
        if(coins.length!=0){
            back(0,coins,amount,new ArrayList<>());
        }
        int min=Integer.MAX_VALUE;

        if(res.size()==0){
            return -1;
        }
        for(int i=0;i<res.size();i++){
            if(min>res.get(i).size()){
                min=res.get(i).size();

            }
        }
        return min;

    }

    public static void main(String[] args) {
        int[]coins={1,2147483647};
        T3 test=new T3();
        test.coinChange(coins,2);

    }
}
