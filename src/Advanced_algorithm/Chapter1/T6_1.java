package Advanced_algorithm.Chapter1;

public class T6_1 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0)return 1;
        for(int i=0;i<nums.length;i++){
            while(nums[i]>=1 && nums[i]<=nums.length){
                if(nums[i]==nums[nums[i]-1]){
                    break;
                }
                swap(nums,i,nums[i]-1);
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return nums.length+1;

    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
