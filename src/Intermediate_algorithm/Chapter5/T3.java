package Intermediate_algorithm.Chapter5;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T3 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a-b;
            }
        });

        for(int i=0;i<nums.length;i++){
            if(queue.size()<k){
                queue.add(nums[i]);
            }
            else {
                if(nums[i]>queue.peek()){
                    queue.poll();
                    queue.add(nums[i]);
                }
            }

        }

        return queue.poll();

    }
}
