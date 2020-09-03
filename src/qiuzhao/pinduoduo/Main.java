package qiuzhao.pinduoduo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    int count=0;
    // 求数组中最大的区域面积
    public int getMaxArea(int[][]arr, int row, int col){
        int max=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    count=0;
                    commute(arr,i,j,row,col);
                    max=Math.max(max,count);
                }
            }
        }
        return max;
    }

    public void commute(int[][]arr, int i, int j,int row,int col){
        if(i<0 || i>=row || j<0 || j>=col || arr[i][j]==0){
            return;
        }
        arr[i][j]=0;
        count++;
        commute(arr,i+1,j,row,col);
        commute(arr,i,j+1,row,col);
        commute(arr,i-1,j,row,col);
        commute(arr,i,j-1,row,col);
    }

    public void arrcopy(int[][]temp, int[][]arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                temp[i][j] = arr[i][j];
            }
        }
    }

    public int getRes(int[][]arr){
        int ans = 0;
        int onecount = 0;
        int zerocount = 0;
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==1){
                    onecount++;
                }
                else{
                    zerocount++;
                }
            }
        }
        int[][]temp = new int[row][col];
        arrcopy(temp, arr);
        if(onecount == getMaxArea(temp, row, col) || zerocount==0){
            return onecount;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    arr[i][j]=1;
                    arrcopy(temp, arr);
                    int newans = getMaxArea(temp, row, col);
                    newans = Math.min(onecount, newans);
                    ans = Math.max(ans, newans);
                    arr[i][j]=0;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Main test=new Main();
        Scanner scanner=new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][]arr = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(test.getRes(arr));
    }
}
