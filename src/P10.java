public class P10 {

    public int Fibonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else if(n>1){
            int one =0;
            int sum=1;
            for(int i=2;i<=n;i++){
                sum=sum+one;
                one=sum-one;
            }
            return sum;
        }
        return 0;

    }
}
