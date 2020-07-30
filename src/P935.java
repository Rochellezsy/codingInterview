public class P935 {
    int[][]path = {{4, 6}, {6,8}, {7, 9}, {4, 8}, {3, 9, 0}, {}, {1, 7, 0}, {2, 6}, {1, 3}, {4, 2}};
    int num = 10;
    int mod = 1000000007;

    public int knightDialer(int N) {
        int res=0;
        int[][]dp=new int[N][num];
        for(int i=0; i<=9; i++){
            dp[0][i]=1;
        }
        for(int i=1; i<N; i++){
            for(int j=0; j<num; j++){
                for(int k=0; k<path[j].length; k++){
                    dp[i][j] = (dp[i][j] + dp[i-1][path[j][k]]) % mod;
                }
            }
        }

        for(int i=0; i<num; i++){
            res = (res + dp[N-1][i]) % mod;
        }
        return res;

    }

    public static void main(String[] args) {
        P935 test=new P935();
        System.out.println(test.knightDialer(1));


    }
}
