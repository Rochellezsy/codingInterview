package Intermediate_algorithm.Chapter7;

import java.util.*;

public class RandomizedSet {
    HashMap<Integer,Integer>map;
    List<Integer>list;

    /** Initialize your data structure here. */
    public RandomizedSet() {
        map=new HashMap<>();
        list=new ArrayList<>();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val)){
            map.put(val,list.size());
            list.add(val);
            return true;
        }
        else {
            return false;
        }

    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        else {
            if(list.size()>1){
                int index=map.get(val);
                list.set(index,list.get(list.size()-1));
                map.remove(val,index);
                map.put(list.get(list.size()-1),index);
            }
            else if(list.size()==1){
                list.remove(0);
                map.remove(val,0);
            }
            return true;
        }

    }

    /** Get a random element from the set. */
    public int getRandom() {
        int length=list.size();
        Random random=new Random();
        int index=random.nextInt(length);
        return list.get(index);

    }
}
