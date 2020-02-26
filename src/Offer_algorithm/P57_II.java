package Offer_algorithm;

import java.util.ArrayList;
import java.util.List;

public class P57_II {
    public int[][] findContinuousSequence(int target) {
        List<List<Integer>>res=new ArrayList<>();
        int right=(target+1)/2;
        int i=1;
        int j=i+1;

        while(i<right && j<=right){
            if((i+j)*(j-i+1)==target*2){
                List<Integer>list=new ArrayList<>();
                for(int x=i;x<=j;x++){
                    list.add(x);
                }
                res.add(list);
                j++;
            }
            else if((i+j)*(j-i+1)<target*2){
                j++;
            }
            else if((i+j)*(j-i+1)>target*2){
                i++;
            }
        }
        int size=res.size();
        int[][]ans=new int[size][];
        for(int p=0;p<res.size();p++){
            ans[p]=new int[res.get(p).size()];
            for(int q=0;q<res.get(p).size();q++){
                ans[p][q]=res.get(p).get(q);
            }
        }
        return ans;



    }
}
