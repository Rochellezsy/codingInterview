package Primary_algorithm.Chapter9;

public class T2 {
    public int hammingDistance(int x, int y) {
        int res=x^y;
        int count=0;
        while(res!=0){
            res=res&res-1;
            count++;
        }
        return count;

    }
}
