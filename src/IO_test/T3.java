package IO_test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T3 {
    public int avg(List<Integer> list){
        int size=list.size();
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=list.get(i);
        }
        return sum/size;
    }


    public static void main(String[] args) throws IOException {
        List<Integer>list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String temp=scanner.nextLine();
        Scanner s=new Scanner(temp);
        while(s.hasNext()){
            list.add(s.nextInt());
        }
        System.out.println(list);
        System.out.println(new T3().avg(list));






    }
}
