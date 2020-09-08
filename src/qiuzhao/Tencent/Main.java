package qiuzhao.Tencent;

import java.util.*;

public class Main {
    public void getNum(HashMap<Integer, List<Integer>>map, int key, HashSet<Integer>set, HashSet<Integer>setfu){
        if(setfu.contains(key)){
            return;
        }
        set.add(key);
        for (Integer num : map.get(key)) {
            if(!set.contains(num)){
                set.add(num);
                getNum(map, num, set, setfu);
            }
            setfu.add(num);
        }
    }

    public static void main(String[] args) {
        Main test=new Main();
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int m =  scanner.nextInt();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>setfu = new HashSet<>();
        for(int i=0; i<m; i++){
            int x  = scanner.nextInt();
            int[]a = new int[x];
            for(int j=0; j<x; j++) {
                a[j] = scanner.nextInt();
                if (!map.containsKey(a[j])) {
                    map.put(a[j], new ArrayList<>());
                }
            }

            for(int j=0; j<x; j++){
                for(int k=0; k<x; k++){
                    if(k!=j){
                        List<Integer>list = map.get(a[j]);
                        list.add(a[k]);
                        map.put(a[j], list);
                    }
                }
            }
        }
        test.getNum(map, 0, set, setfu);
        System.out.println(set.size());
    }
}
//
//50 5
//2 1 2
//5 10 11 12 13 14
//2 0 1
//2 49 2
//4 6 7 8 2

//50 2
//2 0 2
//5 2 3 4 5 11