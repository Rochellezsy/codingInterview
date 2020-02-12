package Advanced_algorithm.Chapter1;

import java.util.HashMap;

public class T11 {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int left=0;
        int right=0;
        String res=s;

        while(left<=right && right<s.length()){
            while(judge(s.substring(left,right+1),t)){
                int len=right-left;
                if(len<res.length()){
                    res=s.substring(left,right+1);
                }
                left++;
            }
            right++;
        }
        if(right==s.length() && !judge(s,t)){
            return "";
        }
        return res;
    }

    public boolean judge(String szi,String t){
        if(szi.length()<t.length())return false;
        HashMap<Character,Integer>map=new HashMap<>();

        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int count=map.size();

        for(int i=0;i<szi.length();i++){
            if(map.containsKey(szi.charAt(i))){
                map.put(szi.charAt(i),map.get(szi.charAt(i))-1);
                if(map.get(szi.charAt(i))==0){
                    count--;
                }
            }

        }
        return count == 0;
    }

    public static void main(String[] args) {
        String s="a";
        String t="b";
        T11 test=new T11();
        System.out.println(test.minWindow(s,t));
        System.out.println(test.judge(s,t));
    }
}
