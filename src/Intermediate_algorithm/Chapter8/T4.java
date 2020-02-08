package Intermediate_algorithm.Chapter8;

public class T4 {
    public double myPow(double x, int n) {
        if(n==0)return 1;
        if(n==1)return x;
        if(n==-1)return 1/x;
        double half=myPow(x,n/2);
        double rest=myPow(x,n%2);
        return half*half*rest;
    }

    public static void main(String[] args) {
        T4 test=new T4();
        System.out.println(test.myPow(2,6));
    }
}
