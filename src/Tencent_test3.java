public class Tencent_test3 {

    //冒泡排序
    public void bubblesort(int[]nums){
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(nums[i]>nums[j]){
                    swap(nums,i,j);
                }
            }
        }
    }

    //交换
    public void swap(int[]nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        Tencent_test3 test=new Tencent_test3();
        int[]nums={4,7,3,6,2,9,4};
        test.bubblesort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }

}
