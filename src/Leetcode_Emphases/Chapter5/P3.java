package Leetcode_Emphases.Chapter5;

import java.util.*;

public class P3 {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer>map=new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        PriorityQueue<String>queue=new PriorityQueue<>(new Comparator<String>(){
            public int compare(String a, String b){
                return map.get(a)-map.get(b);
            }
        });

        for(String key: map.keySet()){
            if(queue.size()<k){
                queue.add(key);
            }
            else{
                if(map.get(key)>map.get(queue.peek())){
                    queue.poll();
                    queue.add(key);
                }
                else if(map.get(key)==map.get(queue.peek())){
                    if(queue.peek().compareTo(key)>0){
                        queue.poll();
                        queue.add(key);
                    }
                }
            }
        }
        List<String>res=new ArrayList<>();
        while(!queue.isEmpty()){
            res.add(queue.poll());
        }
        Collections.sort(res, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1)==map.get(o2)){
                    return o1.compareTo(o2);
                }
                else{
                    return map.get(o1)-map.get(o2);
                }
            }
        });
        return res;


    }
}
