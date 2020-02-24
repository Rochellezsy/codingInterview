import java.util.Arrays;
import java.util.Collections;

public class VMware_4 {
    /**
     * 构建二叉搜索树
     */

    //实现方法
    public TreeNode transfer(int[]arr){
        if(arr.length==0)return null;
        int index=arr.length/2;
        TreeNode root=new TreeNode(arr[index]);
        root.left=transfer(Arrays.copyOfRange(arr,0,index));
        root.right=transfer(Arrays.copyOfRange(arr,index+1,arr.length));
        return root;
    }


    //测试main方法
    public static void main(String[] args) {
        int[]arr={3,5,4,6,2};
        Arrays.sort(arr);
        VMware_4 test=new VMware_4();
        TreeNode root=test.transfer(arr);
        System.out.println(root.val);

    }
}
