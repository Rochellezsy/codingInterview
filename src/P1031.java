public class P1031 {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        int []sum = A;
        for(int i=1; i<A.length; i++){
            sum[i]+=sum[i-1];
        }
        int res=sum[L+M-1];
        int Lmax=sum[L-1];
        int Mmax=sum[M-1];
        for(int i=L+M; i<A.length; i++){
            Lmax=Math.max(Lmax, A[i-M]-A[i-M-L]);
            Mmax=Math.max(Mmax, A[i-L]-A[i-M-L]);
            res=Math.max(res, Lmax+A[i]-A[i-M]);
            res=Math.max(res, Mmax+A[i]-A[i-L]);
        }
        return res;

    }
}
