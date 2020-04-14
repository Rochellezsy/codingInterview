public class P329 {
    public int longestIncreasingPath(int[][] matrix) {
        if(matrix.length==0)return 0;
        int max=0;
        int[][]dp=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(dp[i][j]==0){
                    search(matrix,i,j,dp);
                }
                max=Math.max(dp[i][j],max);
            }
        }
        return max;
    }

    public int search(int[][]matrix, int i, int j, int[][]dp){
        if(i<0 || j<0 || i>=matrix.length ||j>=matrix[0].length){
            return 0;
        }
        int ans=0;
        if(dp[i][j]>0){
            return dp[i][j];
        }
        if(i-1>=0 && matrix[i-1][j]<matrix[i][j]){
            ans=Math.max(ans, search(matrix,i-1,j,dp));
        }
        if(i+1<=matrix.length-1 && matrix[i+1][j]<matrix[i][j]){
            ans=Math.max(ans, search(matrix,i+1,j,dp));
        }
        if(j-1>=0 && matrix[i][j-1]<matrix[i][j]){
            ans=Math.max(ans, search(matrix,i,j-1,dp));
        }
        if(j+1<=matrix[0].length-1 && matrix[i][j+1]<matrix[i][j]){
            ans=Math.max(ans, search(matrix,i,j+1,dp));
        }
        dp[i][j]=ans+1;
        return ans+1;
    }
}
