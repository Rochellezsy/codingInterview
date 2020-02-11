package Advanced_algorithm.Chapter1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class T3 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i : A) {
            for (int j : B) {
                map.put(i+j,map.getOrDefault(i+j,0)+1);
            }
        }
        int count=0;
        for (int i : C) {
            for (int j : D) {
                count+=map.getOrDefault(-(i+j),0);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[]A={1,2};
        int[]B={-2,-1};
        int[]C={-1,2};
        int[]D={0,2};

        T3 test=new T3();
        System.out.println(test.fourSumCount(A,B,C,D));


    }
}
