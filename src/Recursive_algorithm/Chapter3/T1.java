package Recursive_algorithm.Chapter3;

public class T1 {
    public int fib(int N) {
        if(N==0)return 0;
        int a=0;
        int b=1;
        for(int i=1;i<N;i++){
            b=b+a;
            a=b-a;
        }
        return b;

    }
}
