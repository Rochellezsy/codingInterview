package Intermediate_algorithm.Chapter5;

public class T8 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=matrix.length-1;
        int j=0;

        while(i>=0 && j<matrix[0].length){
            if(matrix[i][j]==target){
                return true;
            }
            else {
                if(matrix[i][j]>target){
                    i--;
                }
                else if(matrix[i][j]<target){
                    j++;
                }
            }
        }
        return false;

    }
}
