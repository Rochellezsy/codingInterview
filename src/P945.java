import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class P945 {
    public int minIncrementForUnique(int[] A) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a: A){
            map.put(a, map.getOrDefault(a,0)+1);
        }


        int[]key=new int[map.size()];
        int i=0;
        for(int k:map.keySet()){
            key[i]=k;
            i++;
        }
        Arrays.sort(key);
        int ans=0;
        for(int k:key){
            while(map.get(k)>1){
                int temp=k;
                while(map.containsKey(temp)){
                    temp++;
                    ans++;
                }
                map.put(temp,1);
                map.put(k,map.get(k)-1);
            }
        }
        return ans;

    }
}
