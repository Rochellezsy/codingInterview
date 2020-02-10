package Advanced_algorithm.Chapter1;

public class T3_1 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int n=A.length;
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int p=0;p<n;p++){
                    for(int q=0;q<n;q++){
                        if(A[i]+B[j]+C[p]+D[q]==0){
                            count++;
                        }
                    }
                }
            }
        }
        return count;


    }
}
