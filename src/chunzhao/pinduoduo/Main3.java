package chunzhao.pinduoduo;

import java.util.*;

public class Main3 {
    int cost=Integer.MAX_VALUE;
    List<Integer>ans=new ArrayList<>();

    public int solve(List<Integer>list, int K){
        for(int i=0;i<list.size();i++){
            if(i>0 && list.get(i).equals(list.get(i - 1))){
                continue;
            }
            int[][]nums=new int[list.size()][2];
            for(int k=0;k<list.size();k++){
                nums[k][0]=i;
                nums[k][1]=Math.abs(list.get(k)-list.get(i));
            }
            sort(nums, nums.length);
            daijia(nums,K,list.get(i),list);
        }
        return cost;
    }

    public void daijia(int[][]nums, int K, int target,List<Integer>list){
        int res=0;
        for(int i=0;i<K;i++){
            res+=nums[i][1];
        }
        if(res<cost){
            cost=res;
            ans=new ArrayList<>(list);
            for(int i=0; i<K; i++){
                ans.set(nums[i][0],target);
            }
        }
    }

    public void sort(int[][]nums, int size){
        for(int i=0; i<size;i++){
            for(int j=i+1;j<size;j++){
                if(nums[i][1]>=nums[j][1]){
                    swap(nums,i, j);
                }
            }
        }
    }

    public void swap(int[][]nums, int i, int j){
        int temp0=nums[i][0];
        int temp1=nums[i][1];
        nums[i][0]=nums[j][0];
        nums[i][1]=nums[j][1];
        nums[j][0]=temp0;
        nums[j][1]=temp1;
    }

    public static void main(String[] args) {
        Main3 test=new Main3();
//        Scanner scanner=new Scanner(System.in);
//        int N=scanner.nextInt();
//        int K=scanner.nextInt();
//        String temp=scanner.next();
        int N=6;
        int K=4;
        String temp="345678";
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<N;i++){
            list.add(temp.charAt(i)-'0');
        }

        System.out.println(test.solve(list,K));
        for (Integer an : test.ans) {
            System.out.print(an);
        }

    }
}
