import java.util.*;

public class P694 {
    public int numDistinctIslands(int[][] grid) {
        HashSet<List<String>>set=new HashSet<>();
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    List<String> list=new ArrayList<>();
                    search(grid,i,j,i,j,row,col,list);
                    Collections.sort(list);
                    set.add(list);
                }
            }
        }
        return set.size();
    }

    public void search(int[][] grid, int x, int y, int i, int j, int row, int col, List<String> list){
        if(i<0 || i>=row || j<0 ||j>=col || grid[i][j]==0){
            return;
        }
        else {
            grid[i][j]=0;
            list.add("{" + (i - x) +"," +(j - y) +"}");
            search(grid,x,y,i+1,j,row,col,list);
            search(grid,x,y,i-1,j,row,col,list);
            search(grid,x,y,i,j+1,row,col,list);
            search(grid,x,y,i,j-1,row,col,list);
        }
    }

    public static void main(String[] args) {
        int[][]grid={{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        System.out.println(new P694().numDistinctIslands(grid));
    }
}
