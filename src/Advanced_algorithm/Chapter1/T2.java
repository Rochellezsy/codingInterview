package Advanced_algorithm.Chapter1;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>list=new ArrayList<>();
        if(matrix.length==0){
            return list;
        }
        int row=matrix.length-1;
        int col=matrix[0].length-1;

        int up =0;
        int down=row;
        int left= 0;
        int right= col;

        while(true){
            if(up<=down && left<=right){
                for(int i=left;i<=right;i++){
                    list.add(matrix[up][i]);
                }
                up++;
                if(up>down){
                    break;
                }
            }
            if(up<=down && left<=right){
                for(int j=up;j<=down;j++){
                    list.add(matrix[j][right]);
                }
                right--;
                if(left>right){
                    break;
                }
            }

            if(up<=down && left<=right){
                for(int i=right;i>=left;i--){
                    list.add(matrix[down][i]);
                }
                down--;
                if(up>down){
                    break;
                }
            }
            if(up<=down && left<=right){
                for(int j=down;j>=up;j--){
                    list.add(matrix[j][left]);
                }
                left++;
                if(left>right){
                    break;
                }
            }
        }
        return list;

    }

}
