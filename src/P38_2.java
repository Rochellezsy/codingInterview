import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class P38_2 {
    public ArrayList<String> Permutation(String str){
        ArrayList<String> list=new ArrayList<>();
        if(str.length()==0){
            return list;
        }


        digui(str.toCharArray(),0,list);
        Collections.sort(list);

        return list;
    }

    public void digui(char[] str,int begin,ArrayList<String> list){
        if(begin==str.length){
            list.add(String.valueOf(str));
        }

        HashSet<Character>set=new HashSet<>();
        for(int i=begin;i<str.length;i++){

            if(!set.contains(str[i])){
                set.add(str[i]);
                char temp=str[begin];
                str[begin]=str[i];
                str[i]=temp;

                digui(str,begin+1,list);

                temp=str[begin];
                str[begin]=str[i];
                str[i]=temp;

            }

        }


    }



}
