package Intermediate_algorithm.Chapter1;

public class T5 {
    public String longestPalindrome(String s) {

        String ans="";
        int max=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String szi=s.substring(i,j+1);
                if(szi.length()>max && judge(szi)){
                    max=szi.length();
                    ans=szi;
                }
            }
        }
        return ans;

    }

    public boolean judge(String ss){
        int i=0;
        int j=ss.length()-1;
        while(i<=j){
            if(ss.charAt(i)==ss.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }
}
