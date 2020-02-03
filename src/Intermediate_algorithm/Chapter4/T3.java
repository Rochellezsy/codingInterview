package Intermediate_algorithm.Chapter4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T3 {
    List<List<Integer>>res=new ArrayList<>();

    public void back(List<Integer>list,int[]nums){
        if(nums.length==0){
            res.add(list);
        }
        else {
            for(int i=0;i<nums.length;i++){
                ArrayList<Integer> templist = new ArrayList<>(list);
                templist.add(nums[i]);

                int temp=nums[i];
                nums[i]=nums[0];
                nums[0]=temp;
                int []newnums=Arrays.copyOfRange(nums,1,nums.length);
                back(templist,newnums);
            }
        }
    }


    public List<List<Integer>> permute(int[] nums) {
        if(nums.length>=0){
            back(new ArrayList<>(),nums);
        }
        return res;
    }

    public static void main(String[] args) {
        T3 test=new T3();
        int []nums={1,2,3};
        test.permute(nums);
    }
}
