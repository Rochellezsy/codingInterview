package Primary_algorithm.Chapter8;

public class T3 {
    public boolean isPowerOfThree(int n) {
        if(n==0)return false;
        while(n!=1){
            if(n%3!=0)return false;
            n=n/3;
        }
        return true;

    }
}
