public class P348 {
    int[]path;
    int n;

    /** Initialize your data structure here. */
    public P348(int n) {
        path=new int[2*n+2];
        this.n=n;
    }

    /** Player {player} makes a move at ({row}, {col}).
     @param row The row of the board.
     @param col The column of the board.
     @param player The player, can be either 1 or 2.
     @return The current winning condition, can be either:
     0: No one wins.
     1: Player 1 wins.
     2: Player 2 wins. */
    public int move(int row, int col, int player) {
        if(player==1){
            path[row]+=1;
            path[n+col]+=1;
            if(row==col){
                path[2*n]+=1;
            }
            if(row+col==n-1){
                path[2*n+1]+=1;
            }
            if(path[row]==n||path[n+col]==n||path[2*n]==n||path[2*n+1]==n){
                return 1;
            }
        }
        else if(player==2){
            path[row]-=1;
            path[n+col]-=1;
            if(row==col){
                path[2*n]-=1;
            }
            if(row+col==n-1){
                path[2*n+1]-=1;
            }
            if(path[row]==-n||path[n+col]==-n||path[2*n]==-n||path[2*n+1]==-n){
                return 2;
            }
        }
        return 0;

    }
}
