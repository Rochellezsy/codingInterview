package back_algorithm;

/**
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 *
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 *
 * 示例:
 *
 * board =
 * [
 *   ['A','B','C','E'],
 *   ['S','F','C','S'],
 *   ['A','D','E','E']
 * ]
 *
 * 给定 word = "ABCCED", 返回 true
 * 给定 word = "SEE", 返回 true
 * 给定 word = "ABCB", 返回 false
 *
 */
public class T79 {
    public boolean back(char[][]board,String word,boolean[][]flag,int r,int c){
        int row=board.length;
        int col=board[0].length;
        if(word.length()==0){
            return true;
        }
        if(r<0||r>=row||c<0||c>=col||flag[r][c]==true||board[r][c]!=word.charAt(0)){
            return false;
        }
        flag[r][c]=true;
        boolean res=back(board,word.substring(1),flag,r+1,c)||back(board,word.substring(1),flag,r-1,c)||back(board,word.substring(1),flag,r,c+1)||back(board,word.substring(1),flag,r,c-1);
        if(!res){
            flag[r][c]=false;
        }
        return res;
    }


    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] flag=new boolean[row][col];
                    if(back(board,word,flag,i,j)){
                        return true;
                    }
                }

            }
        }
        return false;

    }
}
