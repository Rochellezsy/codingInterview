package Primary_algorithm.Chapter7;

import java.util.Random;

/**
 * nextInt(int n) 方法用于获取一个伪随机，在0(包括)和指定值(不包括)，
 * 从此随机数生成器的序列中取出均匀分布的int值。
 * 在方法调用返回介于0(含)和n(不含)伪随机，均匀分布的int值。
 */

public class T1 {
    private int[] origin;
    private int[] array;

    public T1(int[] nums) {
        this.origin=nums.clone();
        this.array=nums;

    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.origin;
    }

    public int randInt(int min,int max){
        Random random=new Random();
        int res;
        res=random.nextInt(max-min)+min;
        return res;
    }



    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=0;i<array.length;i++){
            int j=randInt(i,array.length);
            swap(array,i,j);
        }
        return array;

    }

    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        T1 test=new T1(nums);
        System.out.println(test.shuffle());
        System.out.println(test.reset());

    }
}
