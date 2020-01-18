package Intermediate_algorithm.Chapter1;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public void setZeroes(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    List<Integer>list=new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }
            }
        }

        int size=res.size();
        for(int i=0;i<size;i++){
            for(int y=0;y<col;y++){
                matrix[res.get(i).get(0)][y]=0;
            }
            for(int x=0;x<row;x++){
                matrix[x][res.get(i).get(1)]=0;
            }
        }

    }
}
