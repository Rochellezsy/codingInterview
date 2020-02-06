package Intermediate_algorithm.Chapter5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class T6 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<List<Integer>>res=new ArrayList<>();
        int i=1;
        while(i<=intervals.length){
            int left=intervals[i-1][0];
            int right=intervals[i-1][1];
            while(i!=intervals.length && right>=intervals[i][0]){
                if(right<=intervals[i][1]){
                    right=intervals[i][1];
                }
                i++;
            }
            if(i==intervals.length || right<intervals[i][0]){
                List<Integer>list=new ArrayList<>();
                list.add(left);
                list.add(right);
                res.add(list);
                i++;
            }
        }

        int size=res.size();
        int[][] ans=new int[size][2];
        for(int j=0;j<size;j++){
            ans[j][0]=res.get(j).get(0);
            ans[j][1]=res.get(j).get(1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals={{2,3},{4,5},{6,7},{8,9},{1,10}};
        T6 test=new T6();
        test.merge(intervals);
    }
}
