package Advanced_algorithm.Chapter1;

public class T5 {
    public void gameOfLife(int[][] board) {
        int row=board.length;
        int col=board[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==1 &&livenumber(board,i,j)<2){
                    board[i][j]=2;
                }
                else if(board[i][j]==1 &&livenumber(board,i,j)>3){
                    board[i][j]=2;
                }
                else if(board[i][j]==0 &&livenumber(board,i,j)==3){
                    board[i][j]=-1;
                }
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==2){
                    board[i][j]=0;
                }
                else if(board[i][j]==-1){
                    board[i][j]=1;
                }
            }
        }
    }


    public int livenumber(int[][]board,int x, int y){
        int ans=0;
        int row=board.length;
        int col=board[0].length;
        for(int i=x-1;i<=x+1;i++){
            for(int j=y-1;j<=y+1;j++){
                if(i==x && j==y){
                    continue;
                }
                if(i>=0 && j>=0 &&i<row && j<col && board[i][j]>0){
                    ans++;
                }
            }
        }
        return ans;

    }
}
