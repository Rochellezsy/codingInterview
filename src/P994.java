public class P994 {
    public int orangesRotting(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;

        int res=0;
        while(true){
            res+=1;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==2){
                        if(i>0 && grid[i-1][j]==1){
                            grid[i-1][j]=-1;
                        }
                        if(i<row-1 && grid[i+1][j]==1){
                            grid[i+1][j]=-1;
                        }
                        if(j>0 && grid[i][j-1]==1){
                            grid[i][j-1]=-1;
                        }
                        if(j<row-1 && grid[i][j+1]==1){
                            grid[i][j+1]=-1;
                        }
                    }
                }
            }
            int decay=0;
            int fresh=0;
            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1){
                        fresh+=1;
                    }
                    if(grid[i][j]==-1){
                        decay+=1;
                        grid[i][j]=2;
                    }
                }
            }
            if(fresh==0){
                return res;
            }
            if(decay==0){
                return -1;
            }
            if(fresh==decay&& fresh==0){
                return 0;
            }
        }

    }
}
