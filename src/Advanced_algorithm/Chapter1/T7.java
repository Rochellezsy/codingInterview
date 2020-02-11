package Advanced_algorithm.Chapter1;

import java.util.HashSet;

public class T7 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        int res=0;

        for (int i=0;i<nums.length;i++) {
            int ans=nums[i];
            int count=0;
            while(set.contains(ans)){
                count++;
                ans++;
            }
            res=Math.max(res,count);
        }
        return res;

    }
}
