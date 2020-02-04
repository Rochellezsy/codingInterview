package Intermediate_algorithm.Chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T5 {
    List<List<Integer>>res=new ArrayList<>();
    public void back(List<Integer>list,int[]nums,int n){
        if(nums.length==n){
            res.add(list);
        }
        else {
            List<Integer>templist=new ArrayList<>(list);
            back(list,nums,n+1);
            templist.add(nums[n]);
            back(templist,nums,n+1);

        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length!=0){
            back(new ArrayList<>(),nums,0);
        }
        return res;

    }
    public static void main(String[] args) {
        T5 test=new T5();
        int []nums={1,2,3};
        test.subsets(nums);
    }
}
