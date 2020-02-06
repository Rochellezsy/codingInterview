package Intermediate_algorithm.Chapter5;

public class T4 {
    public int findPeakElement(int[] nums) {

        int left=0;
        int right=nums.length-1;

        while(left<right){
            int mid=(left+right)/2;
            if(nums[mid]<nums[mid+1]){
                left=mid;
            }
            else {
                right=mid;
            }
        }
        return left;

    }
}
