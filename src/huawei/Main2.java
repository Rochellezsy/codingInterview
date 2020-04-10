package huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public String change(String s){
        char[] ch=s.toCharArray();
        int len=ch.length;
        int i=0;
        while(i<len-1){
            if(ch[i]=='0' && ch[i+1]=='0'){
                ch[i]='1';
                ch[i+1]='0';
            }
            i++;
        }

        int j=0;
        while(j<len-2){
            if(ch[j]=='0' && ch[j+1]=='1' && ch[j+2]=='0'){
                ch[j]='1';
                ch[j+1]='0';
                ch[j+2]='1';
            }
            j++;
        }
        return String.valueOf(ch);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T=scanner.nextInt();
        List<String>list=new ArrayList<>();
        for(int i=0;i<T;i++){
            int len=scanner.nextInt();
            String s=scanner.next();
            list.add(new Main2().change(s));
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}