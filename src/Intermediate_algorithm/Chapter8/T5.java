package Intermediate_algorithm.Chapter8;

public class T5 {
    public int mySqrt(int x) {
        if(x==0 ||x==1)return x;

        double left=0;
        double right=x;

        while((int)left<(int)right){
            double mid=(left+right)/2;
            if(mid*mid>x){
                right=mid;
            }
            else {
                left=mid;
            }
        }
        return (int)left;

    }
}
