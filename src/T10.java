public class T10 {
    public int Fibonacci(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        if(n>1){
            int a=0;
            int b=1;
            for(int i=2;i<=n;i++){
                b=b+a;
                a=b-a;
            }
            return b;
        }
        return 0;

    }

}
