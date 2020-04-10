package chunzhao.pinduoduo;

import java.util.HashMap;
import java.util.Scanner;

public class Main4 {

    public int minnum(int[] arr, int K){
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
            max=Math.max(map.get(a),max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        int[] C=new int[N];
        for(int i=0;i<N;i++){
            C[i]=scanner.nextInt();
        }
        System.out.println(new Main4().minnum(C,K));

    }
}
