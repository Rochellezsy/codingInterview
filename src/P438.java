import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>list=new ArrayList<>();
        char[]arr = p.toCharArray();
        Arrays.sort(arr);
        int plen=p.length();
        for(int i=0; i<s.length()-plen+1; i++){
            String zi = s.substring(i, i+plen);
            char[] temp=zi.toCharArray();
            Arrays.sort(temp);
            if(Arrays.equals(arr,temp)){
                list.add(i);
            }
        }

        return list;
    }
}
