package Primary_algorithm.Chapter4;

import Primary_algorithm.Chapter3.ListNode;

import java.util.Arrays;

public class T5 {
    public TreeNode sortedArrayToBST(int[] nums) {
        int len=nums.length;
        if(len==0) return null;
        int mid=(len+1)/2;
        TreeNode root=new TreeNode(nums[mid]);

        root.left=sortedArrayToBST(Arrays.copyOfRange(nums,0,mid));
        root.right=sortedArrayToBST(Arrays.copyOfRange(nums,mid+1,len));

        return root;
    }
}
