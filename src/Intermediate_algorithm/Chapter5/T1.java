package Intermediate_algorithm.Chapter5;

public class T1 {
    public void sortColors(int[] nums) {
        int i=0;
        int curr=0;
        int j=nums.length-1;
        while(curr<nums.length && i<=j){
            if(nums[curr]==2){
                int temp=nums[curr];
                nums[curr]=nums[j];
                nums[j]=temp;
                j--;
            }
            if(nums[curr]==0){
                int temp=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp;
                i++;
                curr++;
            }
            curr++;
        }

    }

}
