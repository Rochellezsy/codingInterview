package qiuzhao.WeBank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<int[]> getres(int x, int y, int z, int n, int m, List<int[]>list){
        List<int[]>res = new ArrayList<>();
        x = x%4;
        y = y%2;
        z = z%4;
        for (int[] a : list) {
            int tempx = x;
            int tempy = y;
            int tempz = z;
            while(tempx>0){
                int t = a[0];
                a[0] = a[1];
                a[1] = n-t+1;
                tempx--;
            }
            while(tempy>0){
                a[1] = n-a[1]+1;
                tempy--;
            }
            while(tempz>0){
                int t = a[0];
                a[0] = n-a[1]+1;
                a[1] = t;
                tempz--;
            }
            res.add(a);
        }

        return res;
    }


    public static void main(String[] args) {
        Main test = new Main();
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int Q = scanner.nextInt();
        List<int[]> list = new ArrayList<>();
        for(int i=0; i<Q; i++){
            int[]a = new int[2];
            a[0] = scanner.nextInt();
            a[1] = scanner.nextInt();
            list.add(a);
        }
        List<int[]> res = test.getres(x, y, z, n, m, list);
        for (int[] re : res) {
            System.out.print(re[0]+" "+ re[1]);
            System.out.println();
        }


    }
}
