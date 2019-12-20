import java.util.ArrayList;

public class T29 {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list=new ArrayList<>();

        int up=0;
        int down=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;

        while(true){
            for(int i=left;i<=right;i++){
                list.add(matrix[up][i]);
            }
            up++;
            if(up>down) break;

            for(int j=up;j<=down;j++){
                list.add(matrix[j][right]);
            }
            right--;
            if(left>right) break;

            for(int i=right;i>=left;i--){
                list.add(matrix[down][i]);
            }
            down--;
            if(up>down) break;

            for(int j=down;j>=up;j--){
                list.add(matrix[j][left]);
            }
            left++;
            if(left>right) break;
        }
        return list;
    }
}
