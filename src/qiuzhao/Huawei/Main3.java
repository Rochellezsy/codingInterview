package qiuzhao.Huawei;

import java.util.Scanner;

public class Main3 {

    //获取分割数左边的值
    public int getleft(int[] nums, int fen){
        if(fen==0)return 0;
        int ans = 0;
        for(int i=0; i<fen; i++){
            ans+=nums[i];
        }
        return ans;
    }

    //获取分割数右边的值
    public int getright(int[] nums, int fen){
        if(fen==nums.length-1){
            return 0;
        }
        int ans =0;
        for(int i=fen+1; i<nums.length-1; i++){
            ans+=nums[i];
        }
        return ans;
    }

    //获取左右最大值
    public int[] getmax(int n, int[]w, int[]order){
        int[]res=new int[n];
        for(int i=0; i<n; i++){
            int left = getleft(w, order[i]-1);
            int right = getright(w, order[i]-1);
            res[i] = Math.max(left, right);
            w[order[i]-1] = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Main3 test = new Main3();
        int n = scanner.nextInt();
        int[]w = new int[n];
        int[]order = new int[n];
        for(int i=0; i<n; i++){
            w[i] = scanner.nextInt();
        }
        for(int i=0; i<n; i++){
            order[i] = scanner.nextInt();
        }
        for(int a: test.getmax(n, w, order)){
            System.out.println(a);
        }
    }
}
