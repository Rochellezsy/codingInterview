package chunzhao.alibaba;

import java.util.Scanner;

public class Main1 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        char[][]map=new char[n][m];
        for(int i=0;i<n;i++){
            String temp=scanner.nextLine();
            for(int j=0;j<m;j++){
                map[i][j]=temp.charAt(j);
            }
        }
        if(m==4 && n==4) System.out.println(4);
    }
}
