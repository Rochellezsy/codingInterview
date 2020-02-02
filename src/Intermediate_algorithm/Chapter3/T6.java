package Intermediate_algorithm.Chapter3;

public class T6 {
    public void digui(char[][] grid,int r,int c){
        int row=grid.length;
        int col=grid[0].length;

        if(r<0||c<0||r>=row||c>=col||grid[r][c]=='0'){
            return;
        }

        grid[r][c]='0';
        digui(grid,r,c+1);
        digui(grid,r,c-1);
        digui(grid,r-1,c);
        digui(grid,r+1,c);
    }

    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0)return 0;
        int row=grid.length;
        int col=grid[0].length;

        int num=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]=='1'){
                    num++;
                    digui(grid,i,j);
                }
            }
        }
        return num;
    }
}
