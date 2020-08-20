package Binary_tree;

import java.util.Arrays;

public class P654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length==0)return null;
        int index=0;
        int ans = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>ans){
                index = i;
                ans = nums[i];
            }
        }
        TreeNode root = new TreeNode(nums[index]);
        root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
        root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index+1, nums.length));
        return root;
    }
}
