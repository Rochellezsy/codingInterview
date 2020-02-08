package Intermediate_algorithm.Chapter8;

public class T5_1 {
    public int mySqrt(int x) {
        double res=x;
        while((int)res*res>x){
            res=(x/res+res)/2;
        }
        return (int)res;
    }

    public static void main(String[] args) {
        T5_1 test=new T5_1();
        System.out.println(test.mySqrt(5));
    }
}
