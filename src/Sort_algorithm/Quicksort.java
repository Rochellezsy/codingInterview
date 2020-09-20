package Sort_algorithm;

import java.util.Queue;

public class Quicksort {
    public void sort(int[]nums, int l, int r){
        if(l>=r)return;
        int p=partition(nums,l,r);
        sort(nums, l, p-1);
        sort(nums, p+1, r);
    }

    public int partition(int[]nums, int left, int right){
        int pivot=nums[left];
        int i=left+1;
        int j=right;
        while(true){
            while(nums[i]<pivot && i<right){
                i++;
            }
            while(nums[j]>pivot && j>left){
                j--;
            }
            if(i>=j)break;
            swap(nums,i,j);
        }
        swap(nums,left,j);
        return j;
    }

    public void swap(int[]nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


    public static void main(String[] args) {
        int[]nums={3,1,7,4,3,0,2,5};
        Quicksort quicksort=new Quicksort();
        quicksort.sort(nums,0,nums.length-1);
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
