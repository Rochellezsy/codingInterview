public class P5347 {
    public int minCost(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int[][]dp=new int[row+2][col+2];
        boolean[][]flag=new boolean[row+2][col+2];
        for(int i=0;i<row+2;i++){
            for(int j=0;j<col+2;j++){
                dp[i][j]=Integer.MAX_VALUE;
            }
        }
        int[][]newgrid=new int[row+2][col+2];
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                newgrid[i][j]=grid[i-1][j-1];
            }
        }

        dp[1][1]=0;
        int i=1;
        int j=1;
        while(true){
            if(!flag[i][j]){
                flag[i][j]=true;
                if(newgrid[i][j]==1){
                    j++;
                    if(j>col)break;
                }
                else if(newgrid[i][j]==2){
                    j--;
                    if(j<=0)break;
                }
                else if(newgrid[i][j]==3){
                    i++;
                    if(i>row)break;
                }
                else if(newgrid[i][j]==4){
                    i--;
                    if(i<=0) break;
                }
                dp[i][j]=0;
            }
            else if(flag[i][j]){
                break;
            }
        }

        for(i=1;i<=row;i++){
            for(j=1;j<=col;j++){
                if(dp[i][j]==0)continue;
                int temp1;
                int temp2;
                int temp3;
                int temp4;

                //左边
                if(dp[i][j-1]==Integer.MAX_VALUE){
                    temp1=Integer.MAX_VALUE;
                }
                else{
                    temp1=newgrid[i][j-1]==1?dp[i][j-1]:dp[i][j-1]+1;
                }

                //上面
                if(dp[i-1][j]==Integer.MAX_VALUE){
                    temp2=Integer.MAX_VALUE;
                }
                else{
                    temp2=newgrid[i-1][j]==3?dp[i-1][j]:dp[i-1][j]+1;
                }

                //下面
                if(dp[i+1][j]==Integer.MAX_VALUE){
                    temp3=Integer.MAX_VALUE;
                }
                else{
                    temp3=newgrid[i+1][j]==4?dp[i+1][j]:dp[i+1][j]+1;
                }
                //右边
                if(dp[i][j+1]==Integer.MAX_VALUE){
                    temp4=Integer.MAX_VALUE;
                }
                else{
                    temp4=newgrid[i][j+1]==2?dp[i][j+1]:dp[i][j+1]+1;
                }


                int temp=Math.min(temp1,temp2);
                temp=Math.min(temp,temp3);
                temp=Math.min(temp,temp4);
                dp[i][j]=temp;

                if(newgrid[i][j]==1 && j!=col){
                    dp[i][j+1]=Math.min(dp[i][j+1],dp[i][j]);
                }
                if(newgrid[i][j]==2 && j!=1){
                    dp[i][j-1]=Math.min(dp[i][j-1],dp[i][j]);
                }
                if(newgrid[i][j]==3 && i!=row){
                    dp[i+1][j]=Math.min(dp[i+1][j],dp[i][j]);
                }
                if(newgrid[i][j]==4 && i!=1){
                    dp[i-1][j]=Math.min(dp[i-1][j],dp[i][j]);
                }

            }
        }
        return dp[row][col];
    }

    public static void main(String[] args) {
        int[][]grid={{1,3,3,3},{2,2,1,2},{4,3,3,4},{3,2,2,3},{3,2,1,3},{4,1,4,3},{3,3,1,2}};
        P5347 test=new P5347();
        System.out.println(test.minCost(grid));
    }
}
