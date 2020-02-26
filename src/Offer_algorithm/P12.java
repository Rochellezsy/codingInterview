package Offer_algorithm;

public class P12 {
    boolean res=false;
    public boolean exist(char[][] board, String word) {
        int row=board.length;
        int col=board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean[][] flag=new boolean[row][col];
                    search(board,word,flag,i,j,0);
                    if(res){
                        return true;
                    }
                }
            }
        }
        return res;

    }


    public void search(char[][] board,String word,boolean[][] flag,int i,int j,int index){
        if(i<0 ||i>=board.length ||j<0 ||j>=board[0].length ||board[i][j]!=word.charAt(index)||flag[i][j]==true){
            res=false;
            return;
        }
        if(index==word.length()-1){
            res=true;
            return;
        }

        flag[i][j]=true;
        search(board,word,flag,i+1,j,index+1);
        search(board,word,flag,i,j+1,index+1);
        search(board,word,flag,i-1,j,index+1);
        search(board,word,flag,i,j-1,index+1);

    }

    public static void main(String[] args) {

    }
}
