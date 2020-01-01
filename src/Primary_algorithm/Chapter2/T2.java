package Primary_algorithm.Chapter2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T2 {
    int min=Integer.MIN_VALUE;
    int max=Integer.MAX_VALUE;

    public int reverse(int x) {
        int temp;
        long res=0;
        while(x!=0){
            temp=x%10;
            x=x/10;
            res=res*10+temp;
        }
        if(res<min || res>max){
            return 0;
        }
        return (int)res;

    }

}
