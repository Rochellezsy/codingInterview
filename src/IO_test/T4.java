package IO_test;

import java.util.Scanner;
//输入
//3 1
//2 3 1
//5 4
//1 2 1
//3 4 0
//2 5 1
//3 2 1


public class T4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();//n个人
            int m = s.nextInt();//m组关系
            int[][] arr = new int[m][3];
            for (int i = 0; i < m ; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j]= s.nextInt();
                }
            }
        }
    }
}
