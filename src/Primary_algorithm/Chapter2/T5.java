package Primary_algorithm.Chapter2;

public class T5 {
    public boolean isPalindrome(String s) {
        String str=s.replaceAll("[^0-9a-zA-Z]","").toLowerCase();
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;

    }
}
