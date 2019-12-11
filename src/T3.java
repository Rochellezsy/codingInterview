import java.util.HashSet;

public class T3 {
    public int solution3(int[]nums){
        HashSet<Integer> set=new HashSet<>();
        int result=-1;
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }
            else{
                result=nums[i];
                return result;
            }
        }
        return result;

    }
}
