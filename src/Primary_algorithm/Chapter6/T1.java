package Primary_algorithm.Chapter6;

public class T1 {
    public int climbStairs(int n) {
        if(n==1) return 1;
        if(n==2) return 2;
        if(n>2){
            int b=2;
            int a=1;
            for(int i=2;i<n;i++){
                b=b+a;
                a=b-a;
            }
            return b;
        }
        return 0;

    }
}
