package Recursive_algorithm.Chapter5;

import java.util.ArrayList;
import java.util.List;

public class T2_1 {
    public int kthGrammar(int N, int K) {
        List<Integer> list=new ArrayList<>();
        list.add(0);
        for(int i=1;i<N;i++){
            int size=list.size();
            for(int j=0;j<size;j++){
                if(list.get(j)==0){
                    list.add(0);
                    list.add(1);
                }else {
                    list.add(1);
                    list.add(0);
                }
            }
            if (size > 0) {
                list.subList(0, size).clear();
            }
        }
        return list.get(K-1);

    }

    public static void main(String[] args) {
        T2_1 test=new T2_1();
        System.out.println(test.kthGrammar(3,1));
    }
}
