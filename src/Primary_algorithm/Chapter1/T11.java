package Primary_algorithm.Chapter1;

public class T11 {
    public void rotate(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        //上下翻转
        for(int i=0;i<row/2;i++){
            for(int j=0;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[row-i-1][j];
                matrix[row-i-1][j]=temp;
            }
        }

        //对角线翻转
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

    }
}
