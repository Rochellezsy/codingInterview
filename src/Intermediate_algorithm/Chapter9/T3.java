package Intermediate_algorithm.Chapter9;

import java.util.HashMap;

public class T3 {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }

        for (Integer key : map.keySet()) {
            if (map.get(key)>n/2) {
                return key;
            }
        }
        return -1;

    }
}
