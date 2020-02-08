package Intermediate_algorithm.Chapter8;

import java.util.HashSet;

public class T1 {

    public boolean isHappy(int n) {
        int fast=change(change(n));
        int slow=change(n);

        while (fast!=slow){
            slow=change(slow);
            fast=change(fast);
            fast=change(fast);
        }
        if(fast==1){
            return true;
        }
        return false;
    }

    public int change(int n){
        int sum=0;
        while(n!=0){
            int ans=n%10;
            sum+=ans*ans;
            n=n/10;
        }
        return sum;
    }

}
