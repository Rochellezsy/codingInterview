package back_algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class T39 {
    List<List<Integer>>res=new ArrayList<>();

    public void back(int sum,List<Integer>list,int[]candidates,int target){
        if(sum==target){
            Collections.sort(list);
            if(!res.contains(list)){
                res.add(list);
            }
        }
        else if(sum<target){
            for(int i=0;i<candidates.length;i++){
                List<Integer>templist=new ArrayList<>(list);
                templist.add(candidates[i]);
                back(sum+candidates[i],templist,candidates,target);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates.length!=0){
            back(0,new ArrayList<>(),candidates,target);
        }
        return res;
    }
}
