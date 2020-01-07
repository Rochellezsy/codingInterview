package Primary_algorithm.Chapter1;

public class T10 {
    public boolean isValidSudoku(char[][] board) {
        boolean [][]row= new boolean[9][9];
        boolean [][]col= new boolean[9][9];
        boolean [][]block= new boolean[9][9];

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                int ans=board[i][j]-'1';
                int blockindex=(i/3)*3+(j/3);
                if(row[i][ans] || col[j][ans] || block[blockindex][ans]){
                    return false;
                }
                row[i][ans]=true;
                col[j][ans]=true;
                block[blockindex][ans]=true;
            }
        }
        return true;

    }
}
