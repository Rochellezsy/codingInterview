import java.util.HashMap;
import java.util.Stack;

public class T31 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if(pushA==null || popA==null) return false;

        Stack<Integer> stack=new Stack<>();
        int j=0;
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);

            while(!stack.isEmpty() && stack.peek()==popA[j]){
                stack.pop();
                j++;
            }
        }
        return stack.isEmpty();
    }

    public int findSpecialInteger(int[] arr) {
        int len=arr.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int a: arr){
            map.put(a, map.getOrDefault(a,0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)>len/4){
                return key;
            }
        }
        return -1;

    }
}
