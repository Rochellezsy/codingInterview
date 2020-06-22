public class P179 {
    public String largestNumber(int[] nums) {
        sort(nums);
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<nums.length; i++){
            sb.append(nums[i]);
        }
        return sb.toString();

    }

    public void sort(int[]nums){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int ml=0;
                int nl=0;
                int m=nums[i];
                int n=nums[j];
                while(m!=0){
                    m=m/10;
                    ml++;
                }
                while(n!=0){
                    n=n/10;
                    nl++;
                }
                int ans1=nums[i];
                while(ml>1){
                    ans1=ans1*10;
                    ml--;
                }
                ans1+=nums[j];
                int ans2=nums[j];
                while(nl>1){
                    ans2=ans2*10;
                    nl--;
                }
                ans2+=nums[i];
                if(ans1<ans2){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[]nums={10,2};
        new P179().largestNumber(nums);

    }
}
