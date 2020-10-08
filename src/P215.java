public class P215 {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        int target = len - k;
        while(true){
            int index = partition(nums, left, right);
            if(index == target){
                return nums[index];
            }
            else if(index >target){
                right = index - 1;
            }
            else{
                left = index + 1;
            }
        }


    }

    public int partition(int[]nums, int left, int right){
        int pivot = nums[left];
        int i = left+1;
        int j = right;
        while(true){
            while(i<right && nums[i]<=pivot){
                i++;
            }
            while(j>left && nums[j]>pivot){
                j--;
            }
            if(i>=j) break;
            swap(nums, i, j);
        }
        swap(nums, left, j);
        return j;
    }

    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int []nums = {3,3,3,3};
        int k = 1;
        P215 test = new P215();
        System.out.println(test.findKthLargest(nums, k));
    }
}
