import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;


public class P38_1 {
    public ArrayList<String> Permutation(String str){
        ArrayList<String> list=new ArrayList<>();
        if(str.length()>0){
            digui(str.toCharArray(),0,list);
        }
        Collections.sort(list);
        return list;


    }

    public void digui(char[] str,int begin,ArrayList<String>list){
        if(begin==str.length){
            list.add(String.valueOf(str));
        }

        HashSet<Character> set=new HashSet<>();

        for(int i=begin;i<str.length;i++){
            if(!set.contains(str[i])){
                set.add(str[i]);
                char temp=str[i];
                str[i]=str[begin];
                str[begin]=temp;

                digui(str,begin+1,list);

                temp=str[i];
                str[i]=str[begin];
                str[begin]=temp;

            }

        }


    }

    public static void main(String[] args) {
        String str="aba";
        P38 test=new P38();
        ArrayList<String > list=new ArrayList<>();

        list=test.Permutation(str);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }

}
