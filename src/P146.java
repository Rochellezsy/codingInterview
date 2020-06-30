import java.util.HashMap;
import java.util.LinkedList;

public class P146 {
    HashMap<Integer,Integer> map;
    LinkedList<Integer> list;
    int size;

    public P146(int capacity) {
        map=new HashMap<>();
        list=new LinkedList<>();
        this.size=capacity;
    }

    public int get(int key) {
        if(map.containsKey(key)){
            list.remove((Integer)key);
            list.add(key);
            return map.get(key);
        }
        else{
            return -1;
        }

    }

    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            list.remove((Integer)key);
            list.add(key);
        }
        else{
            if(map.size()>=size){
                map.remove(list.pollFirst());
                map.put(key,value);
                list.add(key);
            }
            else{
                map.put(key,value);
                list.add(key);
            }
        }

    }
}
