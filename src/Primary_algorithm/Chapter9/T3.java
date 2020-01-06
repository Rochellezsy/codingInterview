package Primary_algorithm.Chapter9;

public class T3 {
    public int reverseBits(int n) {
        int res = 0;
        for(int i=0;i<32;i++){
            int cur=n&1;
            res=res+(cur<<(31-i));
            n=n>>1;
        }
        return res;

    }
}
