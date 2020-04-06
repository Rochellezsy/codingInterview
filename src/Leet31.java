import java.util.Arrays;

public class Leet31 {
    public void nextPermutation(int[] nums) {
        int len=nums.length-1;

        int index=0;
        for(int i=len; i>=1; i--){
            if(nums[i]>nums[i-1]){
                index=i;
                break;
            }
        }
        if(index==0){
            reverse(nums,0, nums.length-1);
        }
        else{
            index--;
            for(int j=nums.length-1;j>index;j--){
                if(nums[j]>nums[index]){
                    swap(nums,index,j);
                    reverse(nums,index+1, nums.length-1);
                    break;
                }
            }
        }


    }

    public void swap(int[]nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void reverse(int[]nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[]nums={1,3,2};
        new Leet31().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
