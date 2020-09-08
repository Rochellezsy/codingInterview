package qiuzhao.Xiaomi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String temp=scanner.nextLine();
        Scanner s=new Scanner(temp);
        while(s.hasNext()){
            list.add(s.next());
        }
        int size = list.size();
        int[]res = new int[size];
        int index=0;

        for(String ans: list){
            int l = ans.length();
            if(l<8 || l>120){
                res[index] = 1;
                index++;
                continue;
            }
        }

    }
}
