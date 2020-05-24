import java.util.HashMap;

public class P953 {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character, Integer> map=new HashMap<>();
        for(int i=0; i<order.length(); i++){
            map.put(order.charAt(i),i+1);
        }


        for(int i=0;i<words.length-1;i++){
            if(!compare(words[i], words[i+1], map)){
                return false;
            }
        }
        return true;

    }

    public boolean compare(String word1, String word2, HashMap<Character, Integer>map){
        int len=Math.min(word1.length(), word2.length());
        for(int i=0;i<len;i++){
            if(map.get(word1.charAt(i))<map.get(word2.charAt(i))){
                return true;
            }
            else if(map.get(word1.charAt(i))>map.get(word2.charAt(i))){
                return false;
            }
        }
        return len==word1.length();
    }

    public static void main(String[] args) {
        String[]words={"hello","leetcode"};
        String order="hlabcdefgijkmnopqrstuvwxyz";
        System.out.println(new P953().isAlienSorted(words,order));
    }
}
