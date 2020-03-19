package Saima_Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> reverse(List<Integer>list){
        List<Integer>res=new ArrayList<>();
        int len=list.size();
        for(int i=len-1;i>=0;i--){
            res.add(list.get(i));
        }
        return res;
    }

    public boolean judge(List<Integer>list){
        int ji=0;
        int ou=0;
        for(int i=0;i<list.size();i++){
            if((i+1)%2!=0){
                ji+=list.get(i);
            }
            else{
                int ans=list.get(i)*2;
                if(ans>=10){
                    ans=ans-9;
                }
                ou+=ans;
            }
        }
        int res=ji+ou;
        if(res%10==0)return true;
        return false;

    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        String temp=scanner.nextLine();

        char[] s=temp.toCharArray();
        for(int i=0;i<s.length;i++){
            list.add(s[i]-48);
        }

        Main main=new Main();
        list=main.reverse(list);

        if(main.judge(list)){
            System.out.println("ok");
        }
        else {
            System.out.println("error");
        }

    }
}
