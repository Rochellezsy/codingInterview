package qiuzhao.pony;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public void changev(int n, int[]p, int[] v, int index){
        if(p[index+1] == -1){
            return;
        }
        v[p[index+1]-1] = 1;
        changev(n, p, v, p[index+1]-1);
    }

    public List<Integer> getres(int n, int[]p, int[]v){
        List<Integer>list = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(v[i] == 0){
                list.add(i+1);
                for(int j=0; j<n; j++){
                    if(p[j] == i+1){
                        p[j] = p[i];
                        if(v[j] == 1){
                            changev(n, p, v, j);
                        }
                    }
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {
        Main test = new Main();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]p = new int[n];
        int[]v = new int[n];
        for(int i=0; i<n; i++){
            p[i] = scanner.nextInt();
            v[i] = scanner.nextInt();
        }
        List<Integer>list = test.getres(n, p, v);
        if(list.size()==0){
            System.out.println(-1);
        }
        else{
            for (Integer i : list) {
                System.out.print(i + " ");
            }
        }
    }
}
