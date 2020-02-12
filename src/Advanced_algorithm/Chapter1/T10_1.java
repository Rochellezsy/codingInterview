package Advanced_algorithm.Chapter1;

import java.util.Deque;
import java.util.LinkedList;

public class T10_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list=new LinkedList<>();
        if(nums.length<=1)return nums;
        int []res=new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){
            if(list.isEmpty() || nums[i]<nums[list.peekLast()]){
                list.add(i);
            }

            while(!list.isEmpty() && nums[i]>=nums[list.peekLast()]){
                list.pollLast();
            }
            list.add(i);
            if(!list.isEmpty()&&list.peekFirst()<=i-k){
                list.pollFirst();
            }
            if(i>=k-1){
                res[i-k+1]=nums[list.peekFirst()];
            }
        }
        return res;


    }
}
