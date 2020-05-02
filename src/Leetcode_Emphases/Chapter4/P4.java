package Leetcode_Emphases.Chapter4;

import java.util.*;

public class P4 {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer>map=new HashMap<>();
        List<String>list=new ArrayList<>();
        for(String b: banned){
            list.add(b);
        }
        paragraph=paragraph.toLowerCase().replace(",", " ").replace("!", " ").replace("?", " ").replace("'", " ").replace(":", " ").replace(".", " ");
        String[] arr=paragraph.split("\\s+");
        for(String a: arr){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        PriorityQueue<String>queue=new PriorityQueue<>(new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return map.get(o2)-map.get(o1);
            }
        });

        for(String key:map.keySet()){
            queue.add(key);
        }

        while(!queue.isEmpty()){
            String res=queue.poll();
            if(!list.contains(res)){
                return res;
            }
        }
        return null;


    }
}
