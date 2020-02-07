package Intermediate_algorithm.Chapter6;

public class T1 {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        if(n<=1)return true;

        int maxindex=nums[0];

        for(int i=1;i<n;i++){
            if(i<=maxindex){
                maxindex=Math.max(maxindex,nums[i]+i);
            }
        }

        return maxindex>=n-1;


    }

    public static void main(String[] args) {
        T1 test=new T1();
        int[]nums={0,1};
        System.out.println(test.canJump(nums));
    }
}
