package Primary_algorithm.Chapter1;

/**
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 */

public class T8 {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        while(i<j && j<nums.length){
            if(nums[i]!=0){
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]!=0){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
                j++;
            }
            else if(nums[i]==0 && nums[j]==0){
                j++;
            }
        }


    }
}
