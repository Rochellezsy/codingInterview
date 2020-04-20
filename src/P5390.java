import java.util.HashMap;

public class P5390 {
    public int minNumberOfFrogs(String croakOfFrogs) {
        if(croakOfFrogs.length()%5!=0)return -1;
        if(croakOfFrogs.charAt(0)!='c')return -1;
        int len=croakOfFrogs.length();
        HashMap<Character, Integer>map=new HashMap<>();
        for(int i=0;i<croakOfFrogs.length();i++){
            map.put(croakOfFrogs.charAt(i),map.getOrDefault(croakOfFrogs.charAt(i),0)+1);
        }
        if(map.size()!=5)return -1;
        for (Character character : map.keySet()) {
            if(map.get(character)!=len/5){
                return -1;
            }
        }

        int i=0;
        int ans=0;
        int index=0;
        while(i<croakOfFrogs.length()){
            if(croakOfFrogs.charAt(i)=='c'){
                if(i-index<5){
                    ans++;
                }
                index=i;
            }
            i++;
        }
        return ans;

    }
}
