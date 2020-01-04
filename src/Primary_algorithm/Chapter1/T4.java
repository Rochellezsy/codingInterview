package Primary_algorithm.Chapter1;

import java.util.HashSet;

public class T4 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else {
                return true;
            }
        }
        return false;

    }
}
