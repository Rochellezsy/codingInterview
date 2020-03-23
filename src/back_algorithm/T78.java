package back_algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
 *
 * 说明：解集不能包含重复的子集。
 */

public class T78 {
    List<List<Integer>>res=new ArrayList<>();
    public void back(List<Integer>list,int[]nums,int index){
        if(index==nums.length){
            res.add(list);
        }
        else {
            List<Integer> templist=new ArrayList<>(list);
            templist.add(nums[index]);
            back(templist,nums,index+1);
            back(list,nums,index+1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length!=0){
            back(new ArrayList<>(),nums,0);
        }
        return res;

    }
}
