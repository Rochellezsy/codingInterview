public class VMware_2 {
    public int search(int[]nums){
        int ans=Integer.MIN_VALUE;
        int res=Integer.MIN_VALUE;

        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>ans){
                ans=nums[i];
                index=i;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(i==index){
                continue;
            }
            if(nums[i]>res){
                res=nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[]nums={3,6,1,4,7};
        VMware_2 test=new VMware_2();
        System.out.println(test.search(nums));
    }

}
