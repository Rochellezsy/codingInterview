public class P04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len=nums1.length+nums2.length;
        if(len%2==0){
            return (double)(findKthNumber(nums1,0,nums2,0,len/2)+findKthNumber(nums1,0,nums2,0,(len/2)+1))/2;
        }
        else{
            return (double)findKthNumber(nums1,0,nums2,0,(len+1)/2);
        }
    }

    public int findKthNumber(int[]nums1, int i, int[]nums2, int j, int k){
        if(i>=nums1.length) return nums2[j+k-1];
        if(j>=nums2.length) return nums1[i+k-1];
        if(k==1) return Math.min(nums1[i],nums2[j]);
        int mid1=i+k/2-1 < nums1.length?nums1[i+k/2-1]:Integer.MAX_VALUE;
        int mid2=j+k/2-1 < nums2.length?nums2[j+k/2-1]:Integer.MAX_VALUE;
        if(mid1<=mid2){
            return findKthNumber(nums1,i+k/2,nums2,j,k-k/2);
        }
        return findKthNumber(nums1,i,nums2,j+k/2,k-k/2);

    }
}
