import java.util.HashMap;

public class Tencent_test1 {

    public static void main(String[] args) {
        String s="jdfdfgv";
        HashMap<Character, Integer>map=new HashMap<>();
        int len=s.length();
        for(int i=0;i<len;i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for (Character character : map.keySet()) {
            System.out.print(character+" ");
            System.out.println(map.get(character));
        }
    }
}
