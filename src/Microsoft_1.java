public class Microsoft_1 {
    public int search(int[] arr, int target) {
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[left]==arr[right]){
                if(arr[mid] > target){
                    right=mid-1;
                }
                else if (arr[mid]<target){
                    left=mid+1;
                }
                else{
                    return left;
                }
            }
            else if(arr[mid]==target && (mid==0||arr[mid-1]!=target)){
                return mid;
            }
            else if(arr[mid]>=arr[left]){
                if(target>arr[left] && target<arr[mid]){
                    right=mid-1;
                }
                else{
                    left=mid;
                }
            }
            else if(arr[mid]<arr[left]){
                if(target>arr[mid] && target<arr[right]){
                    left=mid+1;
                }
                else{
                    right=mid;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[]arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        System.out.println(new Microsoft_1().search(arr, 11));
    }
}
