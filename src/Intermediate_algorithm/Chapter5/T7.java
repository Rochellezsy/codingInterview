package Intermediate_algorithm.Chapter5;

public class T7 {
    public int search(int[] nums, int target) {
        if(nums.length==0){
            return -1;
        }
        int left=0;
        int right=nums.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>=nums[left]){
                if(nums[left]<=target && target<nums[mid]){
                    right=mid-1;
                }
                else {
                    left=mid+1;
                }
            }
            else if(nums[mid]<nums[left]){
                if(nums[right]>=target && target>nums[mid]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return -1;

    }
}
