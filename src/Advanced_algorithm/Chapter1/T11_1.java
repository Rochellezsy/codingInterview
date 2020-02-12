package Advanced_algorithm.Chapter1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class T11_1 {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        List<List<Integer>>res=new ArrayList<>();

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }

        int count=map.size();
        int left=0;
        int right=0;

        while(right<s.length()){
            char c=s.charAt(right);

            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    count--;
                }
            }
            right++;

            while(count==0){
                List<Integer>list=new ArrayList<>();
                list.add(left);
                list.add(right);
                list.add(right-left);
                res.add(list);

                char cl=s.charAt(left);
                if(map.containsKey(cl)){
                    map.put(cl,map.get(cl)+1);
                    if(map.get(cl)==1){
                        count++;
                    }
                }
                left++;
            }
        }

        int len=Integer.MAX_VALUE;
        String ans="";
        for(int i=0;i<res.size();i++){
            if(len>res.get(i).get(2)){
                len=res.get(i).get(2);
                ans=s.substring(res.get(i).get(0),res.get(i).get(1));
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        T11_1 test=new T11_1();
        System.out.println(test.minWindow(s,t));

    }
}
