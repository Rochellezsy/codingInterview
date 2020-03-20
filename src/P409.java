import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class P409 {
    public int longestPalindrome(String s) {
        char[]ans=new char[52];
        char[]ch=s.toCharArray();
        for(char c:ch){
            ans[c-'A']++;
        }

        int result=0;
        for(int i=0;i<52;i++){
            if(ans[i]%2==0){
                result+=ans[i];
            }
            else {
                result+=ans[i]-1;
            }
        }

        if(result==s.length()){
            return result;
        }
        else {
            return result+1;
        }

    }
}
