package qiuzhao.Aiqiyi;

import java.util.HashSet;
import java.util.Scanner;

public class Main1 {
    public boolean isPathCrossing(String path) {
        if (path.equals("")) {
            return false;
        }

        int x = 0;
        int y = 0;
        HashSet<String> set = new HashSet<>();

        //添加原点  --> 将坐标点添加到set集合
        set.add("0,0");

        //遍历字符串,记录坐标
        for (int i = 0; i < path.length(); i++) {
            switch (path.charAt(i)) {
                case 'N':
                    y++;
                    break;
                case 'S':
                    y--;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            //如果坐标已经存在set中,则返回true;
            String ans = x+","+y;
            if(set.contains(ans)){
                return true;
            }
            else{
                set.add(ans);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Main1 test=new Main1();
        Scanner scanner=new Scanner(System.in);
        String path = scanner.nextLine();
        System.out.println(test.isPathCrossing(path));
        System.out.println(test.isPathCrossing("ESSWNEE"));
    }
}
