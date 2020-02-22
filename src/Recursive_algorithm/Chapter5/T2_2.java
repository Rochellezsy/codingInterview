package Recursive_algorithm.Chapter5;

public class T2_2 {
    public int kthGrammar(int N, int K) {
        if(K==0)return 1;
        if(K==1)return 0;
        int last=kthGrammar(N-1,(K+1)/2);
        if(last==K%2){
            return 1;
        }else {
            return 0;
        }

    }
}
