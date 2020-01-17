package Primary_algorithm.Chapter9;

public class T6_2 {
    public int missingNumber(int[] nums) {
        int miss=nums.length;
        for(int i=0;i<nums.length;i++){
            miss=miss^i^nums[i];
        }
        return miss;
    }
}
