package Intermediate_algorithm.Chapter4;

public class T4 {
    Boolean flag=false;

    public void back(char[][]board,String word,int r,int c,int[][]biaozhi){
        int row=board.length;
        int col=board[0].length;
        if(word.length()==0){
            flag=true;
            return;
        }
        if(r<0||c<0||r>=row||c>=col||board[r][c]!=word.charAt(0)){
            return;
        }
        if(board[r][c]==word.charAt(0)&&biaozhi[r][c]!=1){
            biaozhi[r][c]=1;
            back(board,word.substring(1),r+1,c,biaozhi);
            back(board,word.substring(1),r-1,c,biaozhi);
            back(board,word.substring(1),r,c+1,biaozhi);
            back(board,word.substring(1),r,c-1,biaozhi);
        }
        if(!flag){
            biaozhi[r][c]=0;
        }
    }

    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        if(word.length()!=0){
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(board[i][j]==word.charAt(0)){
                        int[][]biaozhi = new int[row][col];
                        back(board,word,i,j,biaozhi);
                    }

                }
            }
            return flag;
        }
        return false;
    }

    public static void main(String[] args) {
        T4 test=new T4();
        char[][]board={{'A','B','C','E'},
                {'S','F','E','S'},
                {'A','D','E','E'}};
        String word="EFS";
        System.out.println(test.exist(board,word));
    }
}
