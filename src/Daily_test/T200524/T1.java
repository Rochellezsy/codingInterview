public class T1 {
    int cnt=0;
    public int findTargetSumWays(int[] nums, int S) {
        search(0, 0, nums, S);
        return cnt;

    }

    public void search(int ans, int index, int[]nums, int S){
        if(ans==S && index==nums.length){
            cnt++;
            return;
        }
        else if (ans!=S && index==nums.length){
            return;
        }
        else{
            search(ans-nums[index], index+1, nums, S);
            search(ans+nums[index], index+1, nums, S);
        }
    }

    public static void main(String[] args) {
        int[]nums={1,1,1,1,1};
        System.out.println(new T1().findTargetSumWays(nums,3));
    }
}
