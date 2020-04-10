package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public int jisuan(int N, int L){
        return (pow(N,L+1)-2/(N-1))%1000000007;
    }

    public int pow(int N , int L){
        if(L==0)return 1;
        if(L==1)return N;
        int half=pow(N,L/2);
        int yu=pow(N,L%2);
        return half*half*yu;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Main1 test=new Main1();
        List<Integer> list=new ArrayList<>();
        while(true){
            int N=scanner.nextInt();
            int L=scanner.nextInt();
            if(N==0 && L==0){
                break;
            }
            else if(N==1 && L!=0){
                list.add(L);
            }
            else {
                list.add(test.jisuan(N,L));
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }


    }
}
