package Leetcode_Emphases.Chapter5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class P2 {
    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length == 0)return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        PriorityQueue<Integer>queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });

        queue.add(intervals[0][1]);

        for(int i=1; i<intervals.length; i++){
            if(queue.peek()<=intervals[i][0]){
                queue.poll();
            }
            queue.add(intervals[i][1]);
        }
        return queue.size();
    }
}
