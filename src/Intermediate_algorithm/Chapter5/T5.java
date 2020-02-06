package Intermediate_algorithm.Chapter5;

public class T5 {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int[]res =new int[2];
        res[0]=-1;
        res[1]=-1;

        while(left<=right){
            if(left==right && nums[left]!=target){
                return res;
            }
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }
            else if(nums[mid]>target){
                right=mid;
            }
            else if(nums[mid]==target){
                while(nums[left]!=target){
                    left++;
                }
                while(nums[right]!=target){
                    right--;
                }
                res[0]=left;
                res[1]=right;
                break;
            }
        }


        return res;

    }

    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        T5 test=new T5();
        test.searchRange(nums,6);
    }
}
