package Offer_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P46 {
    public int translateNum(int num) {
        if(num==0)return 1;
        List<Integer>list=new ArrayList<>();
        while(num!=0){
            int ans=num%10;
            list.add(ans);
            num=num/10;
        }
        Collections.reverse(list);
        int size=list.size();
        int[]dp=new int[size];
        dp[0]=1;
        int temp=0;
        for(int i=1;i<size;i++){
            if(list.get(i-1)==0){
                dp[i]=dp[i-1];
                continue;
            }
            temp=list.get(i)+10*list.get(i-1);
            if(temp<=25){
                if(i==1){
                    dp[1]=2;
                    continue;
                }
                dp[i]=dp[i-1]+dp[i-2];
            }
            else if(temp>25){
                dp[i]=dp[i-1];
            }
        }
        return dp[size-1];
    }

    public static void main(String[] args) {
        P46 test=new P46();
        System.out.println(test.translateNum(26));


    }
}
