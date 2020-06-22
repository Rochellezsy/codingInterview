public class P125 {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)return true;
        StringBuilder ans=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                ans.append(s.charAt(i));
            }
            else if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                ans.append((char)(s.charAt(i)-'A'+'a'));
            }
        }
        return judge(ans);
    }

    public boolean judge(StringBuilder ans){
        int len=ans.length();
        int i = 0;
        int j = len - 1;
        while(i<j){
            if(ans.charAt(i)!=ans.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new P125().isPalindrome("A man, a plan, a canal: Panama"));
    }
}
