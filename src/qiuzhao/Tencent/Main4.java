package qiuzhao.Tencent;

import java.util.*;

public class Main4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        long[][]a = new long[n][2];
        int[]res = new int[n];
        PriorityQueue<long[]>queue = new PriorityQueue<>(new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                return (int) (o2[0]-o1[0]);
            }
        });

        for(int i=0; i<n; i++){
            a[i][0] = scanner.nextLong();
            a[i][1] = i;
            queue.add(a[i]);
        }


        int mid = n/2;
        long max = 0;
        long min = 0;
        while(mid>0){
            long[] temp = queue.poll();
            assert temp != null;
            res[(int) temp[1]] = 1;
            mid--;
            if(mid==0){
                max = temp[0];
            }
        }
        mid = n/2;
        while(mid>0){
            long[] temp = queue.poll();
            if(mid==n/2){
                min = temp[0];
            }
            res[(int) temp[1]] = 0;
            mid--;
        }
        for (int re : res) {
            if(re==1){
                System.out.println(min);
            }
            else{
                System.out.println(max);
            }
        }

    }
}
