package Leetcode_Emphases.Chapter9;

import java.util.Comparator;
import java.util.PriorityQueue;

public class P4 {
    public int[][] kClosest(int[][] points, int K) {
        int[][]result=new int[K][2];
        PriorityQueue<int[]> queue=new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o2[2]-o1[2];
            }
        });

        for(int i=0; i<points.length; i++){
            if(queue.size()<K){
                int[]temp=new int[3];
                int sum=points[i][0]*points[i][0]+points[i][1]*points[i][1];
                temp[0]=points[i][0];
                temp[1]=points[i][1];
                temp[2]=sum;
                queue.add(temp);
            }
            else{
                int[]temp=queue.peek();
                if(points[i][0]*points[i][0]+points[i][1]*points[i][1]<temp[2]){
                    queue.poll();
                    int[]temp2=new int[3];
                    int sum=points[i][0]*points[i][0]+points[i][1]*points[i][1];
                    temp2[0]=points[i][0];
                    temp2[1]=points[i][1];
                    temp2[2]=sum;
                    queue.add(temp2);
                }
            }
        }
        for(int i=0;i<K;i++){
            int[]x=queue.poll();
            result[i][0]=x[0];
            result[i][1]=x[1];
        }
        return result;
    }
}
