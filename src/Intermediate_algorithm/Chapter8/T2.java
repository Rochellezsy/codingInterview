package Intermediate_algorithm.Chapter8;

public class T2 {
    public int trailingZeroes(int n) {
        int count=0;
        while(n>0){
            count=count+n/5;
            n=n/5;
        }
        return count;
    }

    public int jiecheng(int n){
        int a=1;
        int b=1;
        for(int i=2;i<=n;i++){
            b=b*i;
        }
        return b;

    }

    public static void main(String[] args) {
        T2 t=new T2();
        System.out.println(t.jiecheng(7));
        System.out.println(t.trailingZeroes(7));
    }
}
