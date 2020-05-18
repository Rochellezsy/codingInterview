import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P40 {
    List<List<Integer>>res=new ArrayList<>();

    public void search(int sum, List<Integer>list, int target, int index, int[] candidates){
        if(sum==target){
            Collections.sort(list);
            if(!res.contains(list)){
                res.add(list);
            }
        }
        else if(sum<target){
            for(int i=index; i<candidates.length; i++){
                if(i>index && candidates[i]==candidates[i-1]){
                    continue;
                }
                List<Integer>temp=new ArrayList<>(list);
                temp.add(candidates[i]);
                search(sum+candidates[i],temp,target,i+1,candidates);
            }
        }

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        search(0,new ArrayList<>(),target,0,candidates);
        return res;

    }
}
