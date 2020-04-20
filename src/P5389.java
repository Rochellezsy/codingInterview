import java.util.*;

public class P5389 {
    public List<List<String>> displayTable(List<List<String>> orders) {
        List<List<String>>res=new ArrayList<>();
        List<String>caiming=new ArrayList<>();
        List<Integer>set=new ArrayList<>();
        for (List<String> order : orders) {
            if(!set.contains(Integer.valueOf(order.get(1)))){
                set.add(Integer.valueOf(order.get(1)));
            }
            if(!caiming.contains(order.get(2))){
                caiming.add(order.get(2));
            }
        }
        Collections.sort(caiming);
        caiming.add(0,"Table");
        res.add(caiming);

        Collections.sort(set);

        for (Integer s : set) {
            List<String>table=new ArrayList<>();
            table.add(String.valueOf(s));
            HashMap<String,Integer>map=new HashMap<>();
            for (List<String> order : orders) {
                if(order.get(1).equals(String.valueOf(s))){
                    map.put(order.get(2),map.getOrDefault(order.get(2),0)+1);
                }
            }
            for(int i=1;i<caiming.size();i++){
                if(map.containsKey(caiming.get(i))){
                    table.add(String.valueOf(map.get(caiming.get(i))));
                }
                else{
                    table.add("0");
                }
            }
            res.add(table);
        }

        return res;
    }

    public static void main(String[] args) {

    }
}
