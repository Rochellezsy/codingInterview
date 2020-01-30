package Intermediate_algorithm.Chapter1;

import java.util.*;

public class T3 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, ArrayList<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[]ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String s=String.valueOf(ch);
            if(!map.containsKey(s)){
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(strs[i]);
        }

        List<List<String>>res=new ArrayList<>();
        for(List<String> list:map.values()){
            res.add(list);
        }
        return res;


    }

    public static void main(String[] args) {
        String[]strs={"eat","tea","tan","ate","nat","bat"};
        T3 test=new T3();
        test.groupAnagrams(strs);

    }
}
