package Primary_algorithm.Chapter1;

import java.util.Arrays;

public class T6 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[]res=new int[Math.min(nums1.length,nums2.length)];

        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else if(nums1[i]==nums2[j]){
                res[k]=nums1[i];
                i++;
                j++;
                k++;
            }
        }
        return Arrays.copyOfRange(res,0,k);

    }
}
