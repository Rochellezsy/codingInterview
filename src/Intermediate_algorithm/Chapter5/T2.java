package Intermediate_algorithm.Chapter5;

import java.util.*;

public class T2 {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return map.get(a)-map.get(b);
            }
        });

        for(Integer key:map.keySet()){
            if(queue.size()<k){
                queue.add(key);
            }
            else if(map.get(key)>map.get(queue.peek())){
                queue.remove();
                queue.add(key);
            }
        }

        List<Integer> res = new ArrayList<>();
        while (!queue.isEmpty()) {
            res.add(queue.remove());
        }
        return res;
    }
}
