package Primary_algorithm.Chapter1;

import java.util.HashMap;

public class T9 {
    public int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int ans=target-nums[i];
            if(map.containsKey(ans) && map.get(ans)!=i){
                res[0]=i;
                res[1]=map.get(ans);
                break;
            }
        }
        return res;

    }
}
