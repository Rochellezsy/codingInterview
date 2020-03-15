public class P695 {
    int count=0;
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int ans=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    count=0;
                    commute(grid,i,j,row,col);
                    ans=Math.max(ans,count);
                }
            }
        }
        return ans;

    }

    public void commute(int[][]grid, int i, int j,int row,int col){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;
        count++;
        commute(grid,i+1,j,row,col);
        commute(grid,i,j+1,row,col);
        commute(grid,i-1,j,row,col);
        commute(grid,i,j-1,row,col);
    }

    public static void main(String[] args) {
        int[][]nums={{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,1,1,1}};
        System.out.println(new P695().maxAreaOfIsland(nums));

    }
}
