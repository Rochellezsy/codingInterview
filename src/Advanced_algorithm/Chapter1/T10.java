package Advanced_algorithm.Chapter1;

import java.util.Comparator;
import java.util.PriorityQueue;

public class T10 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []res=new int[nums.length-k+1];
        if(nums.length==0 || nums.length==1||nums.length<k)return nums;

        PriorityQueue<Integer>queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        });

        for(int i=0;i<nums.length;i++){
            if(queue.size()==k){
                queue.remove(nums[i-k]);
            }

            if(queue.isEmpty()||queue.peek()<=nums[i]){
                while(!queue.isEmpty()){
                    queue.poll();
                }
                queue.add(nums[i]);
            } else if(queue.peek()>nums[i]){
                queue.add(nums[i]);
            }

            if(i>=k-1){
                res[i-k+1]=queue.peek();
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int []nums={1,-9,8,-6,6,4,0,5};
        T10 test=new T10();
        test.maxSlidingWindow(nums,4);
    }
}
