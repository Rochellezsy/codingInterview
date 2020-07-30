import java.util.*;

public class Test {
    class Pair{
        int[]a;
        public Pair(int a1, int a2){
            a=new int[2];
            a[0] = Math.min(a1, a2);
            a[1] = Math.max(a1, a2);
        }
    }

    public List<Pair> findAllPairs(int[]array, int sum){
//        List<Pair> list=new ArrayList<>();
//        int n = array.length;
//        for(int i=0; i<n; i++){
//            for(int j=i+1; j<n; j++){
//                if(array[i]+array[j]==sum){
//                    Pair temp = new Pair(array[i], array[j]);
//                    list.add(temp);
//                }
//            }
//        }
//        return list;
        List<Pair> list =new ArrayList<>();
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int a:array){
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        int[] nums = new int[keys.size()];
        int index = 0;
        for(int key: keys){
             nums[index] = key;
             index++;
        }
        for (int key : nums) {
            int ans = sum - key;
            if (map.containsKey(ans)) {
                int num1 = map.get(key);
                int num2 = map.get(ans);
                int num;
                if (key == ans) {
                    num = num1 * (num1 - 1) / 2;
                } else {
                    num = num1 * num2;
                }
                for (int j = 0; j < num; j++) {
                    list.add(new Pair(ans, key));
                }
            }
            map.remove(key);
        }
        return list;

    }

    public static void main(String[] args) {
        Test test=new Test();
        int[]array = {1, 2, 5, 2, -1, 3, 1, 2};
        List<Pair>res=test.findAllPairs(array, 4);
        System.out.println(res.size());
        for (Pair re : res) {
            System.out.println("["+re.a[0]+","+re.a[1]+"]");
        }
    }
}
