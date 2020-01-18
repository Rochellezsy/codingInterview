package Intermediate_algorithm.Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class T1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1])continue;
            int ans=0-nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if(j>i+1 &&nums[j]==nums[j-1]) continue;
                int ans2 = ans - nums[j];
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] == ans2) {
                        List<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        res.add(list);
                        break;
                    }
                }
            }
        }
        return res;

    }

    public static void main(String[] args) {

    }
}
