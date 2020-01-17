package Primary_algorithm.Chapter8;

import java.util.HashMap;

public class T4 {
    public int romanToInt(String s) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("IV",4);
        map.put("X",10);
        map.put("IX",9);
        map.put("L",50);
        map.put("XL",40);
        map.put("C",100);
        map.put("XC",90);
        map.put("D",500);
        map.put("CD",400);
        map.put("M",1000);
        map.put("CM",900);

        int len=s.length();
        int ans=0;
        for(int i=0;i<len;i++){
            if(i+1<len && map.containsKey(s.substring(i,i+2))){
                ans=ans+map.get(s.substring(i,i+2));
                i=i+1;
            }
            else {
                ans=ans+map.get(s.substring(i,i+1));
            }
        }
        return ans;

    }
}
