package Map;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class P332 {
    /**
     *  重新安排行程
     * @param tickets
     * @return
     */
    public List<String> findItinerary(List<List<String>> tickets) {

        HashMap<String, PriorityQueue<String>> map=new HashMap<>();
        for(List<String> list:tickets){
            if(!map.containsKey(list.get(0))){
                map.put(list.get(0),new PriorityQueue<String>());
            }
            map.get(list.get(0)).add(list.get(1));
        }
        List<String>res=new ArrayList<>();
        dfs("JFK",res,map);
        return res;

    }

    public void dfs(String start, List<String>res, HashMap<String,PriorityQueue<String>> map){
        PriorityQueue<String> temp=map.get(start);
        while(temp!=null && temp.size()>0 ){
            String end=temp.poll();
            dfs(end,res,map);
        }
        res.add(0,start);
    }
}
