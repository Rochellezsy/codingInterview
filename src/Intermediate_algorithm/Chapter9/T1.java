package Intermediate_algorithm.Chapter9;

public class T1 {
    public int getSum(int a, int b) {
        while(b!=0){
            int temp=a^b;
            b=(a&b)<<1;
            a=temp;
        }
        return a;

    }
}
