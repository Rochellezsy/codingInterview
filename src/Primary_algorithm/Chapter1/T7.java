package Primary_algorithm.Chapter1;

import java.util.Arrays;

public class T7 {
    public int[] plusOne(int[] digits) {
        int len=digits.length;
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            digits[i]=digits[i]%10;
            if(digits[i]!=0) return digits;
        }
        digits=new int[len+1];
        digits[0]=1;
        return digits;
    }
}
