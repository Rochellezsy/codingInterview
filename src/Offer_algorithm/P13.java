package Offer_algorithm;

public class P13 {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited=new boolean[m][n];
        return dfs(0,0,m,n,visited,k);
    }

    private static int dfs(int i, int j,int m,int n,boolean[][] visited , int k){
        int sum=i/100+i%100/10+i%10+j/100+j%100/10+j%10;
        if(i>m-1||i<0||j>n-1||j<0||sum>k|| visited[i][j]) return 0;
        visited[i][j]=true;
        int count=dfs(i,j+1,m,n,visited,k)+dfs(i,j-1,m,n,visited,k)
                +dfs(i-1,j,m,n,visited,k)+dfs(i+1,j,m,n,visited,k)+1;
        return count;
    }
}
