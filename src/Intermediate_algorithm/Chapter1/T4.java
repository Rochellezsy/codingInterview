package Intermediate_algorithm.Chapter1;

import java.util.HashSet;

public class T4 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int max=0;

        int i=0;
        int j=0;
        while(i<s.length() && j<s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
                max=Math.max(max,j-i);
            }
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;


    }
}
