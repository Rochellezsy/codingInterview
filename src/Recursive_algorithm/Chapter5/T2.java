package Recursive_algorithm.Chapter5;

import java.util.ArrayList;
import java.util.List;

public class T2 {
    public int kthGrammar(int N, int K) {
        List<Integer>list=new ArrayList<>();
        list.add(0);
        List<Integer>res=new ArrayList<>();
        res=digui(0,N,list);
        return res.get(K-1);

    }

    public List<Integer> digui(int index,int N,List<Integer>list){
        if(index==N){
            return list;
        }else {
            int size=list.size();
            List<Integer>templist=new ArrayList<>();
            for(int i=0;i<size;i++){
                if(list.get(i)==0){
                    templist.add(0);
                    templist.add(1);
                }
                else if(list.get(i)==1){
                    templist.add(1);
                    templist.add(0);
                }
            }
            return digui(index+1,N,templist);
        }
    }
}
