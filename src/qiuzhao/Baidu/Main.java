package qiuzhao.Baidu;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t=0; t<T; t++){
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            List<Integer>list=new ArrayList<>();
            HashMap<Integer, Integer>map = new HashMap<>();
            for(int i=0; i<m; i++){
                int k = scanner.nextInt();
                for(int j=0; j<k; j++){
                    int l = scanner.nextInt();
                    int r = scanner.nextInt();
                    for(int p=l; p<=r; p++){
                        map.put(p, map.getOrDefault(p, 0)+1);
                    }
                }
            }
            for (Integer key : map.keySet()) {
                if(map.get(key)==m){
                    list.add(key);
                }
            }
            System.out.println(list.size());
            Collections.sort(list);
            for (Integer a : list) {
                System.out.print(a+" ");
            }
        }
    }
}
