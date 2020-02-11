package Advanced_algorithm.Chapter1;

public class T8 {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            while(nums[i]!=i+1){
                if(nums[nums[i]-1]==nums[i]){
                    return nums[i];
                }
                swap(nums,i,nums[i]-1);
            }
        }
        return 0;

    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
