package Offer_algorithm;

import java.util.HashSet;
import java.util.LinkedList;

public class P48 {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> set=new LinkedList<>();
        int size=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
            else{
                while(!set.isEmpty() && set.contains(s.charAt(i))){
                    set.remove(0);
                }
                set.add(s.charAt(i));
            }
            if(set.size()>size){
                size=set.size();
            }
        }
        return size;

    }

    public static void main(String[] args) {
        String s="abcabcbb";
        P48 test=new P48();
        System.out.println(test.lengthOfLongestSubstring(s));
    }
}
