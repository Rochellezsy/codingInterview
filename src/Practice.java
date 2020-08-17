public class Practice {
    public int findMaxIndex(int[]nums){
        int l = 0;
        int r = nums.length-1;
        int ans = 0;
        while(l<=r){
            int mid = l + (r - l)/2;
            if(nums[mid]>=nums[0]){
                ans = mid;
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[]nums = {7, 8, 9, 10, 2, 3, 4, 5, 6};
        Practice test = new Practice();
        System.out.println(test.findMaxIndex(nums));
    }
}
