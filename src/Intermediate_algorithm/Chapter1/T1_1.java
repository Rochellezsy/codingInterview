package Intermediate_algorithm.Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T1_1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();

        Arrays.sort(nums);
        if(nums.length<3)return new ArrayList<>();

        for(int k=0;k<nums.length;k++){
            if(nums[k]>0) break;
            if(k>0 && nums[k]==nums[k-1])continue;
            int i=k+1;
            int j=nums.length-1;
            while (i<j){
                if(nums[k]+nums[i]+nums[j]==0){
                    List<Integer>list=new ArrayList<>();
                    while(i<j && nums[i]==nums[i+1]){
                        i++;
                    }
                    while(i<j&&nums[j]==nums[j-1]){
                        j--;
                    }
                    list.add(nums[k]);
                    list.add(nums[i]);
                    list.add(nums[j]);
                    res.add(list);
                    i++;
                    j--;
                }
                else if(nums[k]+nums[i]+nums[j]>0){
                    j--;
                }
                else if(nums[k]+nums[i]+nums[j]<0){
                    i++;
                }

            }

        }

        return res;

    }
}
