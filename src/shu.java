import java.util.Arrays;

public class shu {

    public boolean panduan(int[]nums){
        if(nums.length==0 || nums.length==1)return true;
        int root=nums[0];
        int i=1;
        while(i<nums.length && nums[i]<root){
            i++;
        }
        int j=i;
        while(j<nums.length){
            if(nums[j]<root){
                return false;
            }
            j++;
        }
        return panduan(Arrays.copyOfRange(nums,1,i)) && panduan(Arrays.copyOfRange(nums,i,nums.length));
    }


}
