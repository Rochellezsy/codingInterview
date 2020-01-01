package Primary_algorithm.Chapter9;

public class T1 {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0){
            n=n&n-1;
            count++;
        }
        return count;
    }
}
