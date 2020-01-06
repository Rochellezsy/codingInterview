package Primary_algorithm.Chapter2;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class T4 {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[]ss=s.toCharArray();
        char[]tt=t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        return Arrays.equals(ss,tt);

    }
}
