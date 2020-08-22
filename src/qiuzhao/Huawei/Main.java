package qiuzhao.Huawei;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Integer[][]value = new Integer[n][2];
        for(int i=0; i<n; i++){
            int v = scanner.nextInt();
            int w = scanner.nextInt();
            //value[i][0]获取的钱
            value[i][0] = v+w*2;
            //value[i][0]放入订单编号
            value[i][1] = i+1;
        }
        //排序
        Arrays.sort(value, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] x, Integer[] y) {
                return y[0]-x[0];
            }
        });
        //输出
        for(int i=0; i<m; i++){
            if(i!=m-1){
                System.out.print(value[i][1]+ " ");
            }
            else{
                System.out.print(value[i][1]);
            }
        }
    }
}
