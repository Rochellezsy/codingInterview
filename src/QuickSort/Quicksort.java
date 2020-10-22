package QuickSort;

public class Quicksort {

    public void quicksort(int[]nums, int l, int r){
        if(l>=r)return;
        int p = partition(nums, l, r);
        quicksort(nums, l, p-1);
        quicksort(nums, p+1, r);
    }

    public int partition(int[]nums, int l, int r){
        int pivot = nums[l];
        int i = l+1;
        int j = r;
        while(true){
            while (nums[i]<pivot && i<=r){
                i++;
            }
            while (nums[j]>pivot && j>l){
                j--;
            }
            if(i>=j){
                break;
            }
            swap(nums, i, j);
        }
        swap(nums, l, j);
        return j;
    }

    public void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
