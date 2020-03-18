public class t3 {
    int ans=0;
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    search(grid,row,col,i,j,0);
                }
            }
        }
        return ans;

    }

    public void search(int[][]grid, int row, int col, int i, int j,int count){
        if(i<0 || j<0 || i>=row || j>=col || grid[i][j]==0){
            if(count>ans){
                ans=count;
            }
            return;
        }
        grid[i][j]=0;
        search(grid,row,col,i+1,j,count+1);
        search(grid,row,col,i-1,j,count+1);
        search(grid,row,col,i,j+1,count+1);
        search(grid,row,col,i,j-1,count+1);

    }

    public static void main(String[] args) {
        int[][] grid={{1,1},{1,0}};
        System.out.println(new t3().maxAreaOfIsland(grid));
    }
}
