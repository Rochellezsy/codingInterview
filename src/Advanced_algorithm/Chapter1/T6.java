package Advanced_algorithm.Chapter1;

import java.util.HashSet;

public class T6 {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>set=new HashSet<>();
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
        }
        if(max<0)return 1;

        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,10,2147483647,9};
        T6 test=new T6();
        System.out.println(test.firstMissingPositive(nums));

    }
}
