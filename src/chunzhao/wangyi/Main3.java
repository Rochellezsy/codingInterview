package chunzhao.wangyi;

import java.util.HashSet;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        Main3 t1=new Main3();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int f=scanner.nextInt();
        set.add(f);
        while(m>0){
            m--;
            boolean flag=false;
            int num=scanner.nextInt();
            int[]arr=new int[num];
            for(int i=0;i<num;i++){
                arr[i]=scanner.nextInt();
                if(set.contains(arr[i])){
                    flag=true;
                }
            }
            if(flag){
                for(int a:arr){
                    set.add(a);
                }
            }
        }

        System.out.println(set.size());
    }
}
