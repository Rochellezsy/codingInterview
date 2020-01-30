package Intermediate_algorithm.Chapter1;

public class T6 {
    public boolean increasingTriplet(int[] nums) {
        int small=Integer.MAX_VALUE;
        int mid=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=small){
                small=nums[i];
            }
            else if(nums[i]<=mid){
                mid=nums[i];
            }
            else if(nums[i]>mid){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[] nums={2,5,3,4,5};
        T6 test=new T6();
        System.out.println(test.increasingTriplet(nums));
    }
}
