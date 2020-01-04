package Primary_algorithm.Chapter2;

import java.util.HashMap;

public class T3 {
    public int firstUniqChar(String s) {
        int[] count=new int[26];

        char[] ss=s.toCharArray();
        for(int i=0;i<ss.length;i++){
            count[ss[i]-'a']++;
        }
        for(int i=0;i<ss.length;i++){
            if(count[ss[i]-'a']==1){
                return i;
            }
        }
        return -1;

    }
}
