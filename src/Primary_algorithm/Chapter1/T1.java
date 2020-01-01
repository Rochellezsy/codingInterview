package Primary_algorithm.Chapter1;

public class T1 {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        int i=0;
        int j=1;
        while(j<=len-1){
            if(nums[i]==nums[j]){
                j++;
            }
            else if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;

    }
}
