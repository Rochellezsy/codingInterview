import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class P38_3 {
    public ArrayList<String> Permutation(String str){
        ArrayList<String> list=new ArrayList<>();
        if(str.length()==0){
            return list;
        }

        digui(str.toCharArray(),0,list);
        Collections.sort(list);
        return list;



    }

    public void digui(char[] c,int begin,ArrayList<String>list){
        if(begin==c.length){
            list.add(String.valueOf(c));
        }
        HashSet<Character>set=new HashSet<>();

        for(int i=begin;i<c.length;i++){
            if(!set.contains(c[i])){
                set.add(c[i]);
                char temp=c[begin];
                c[begin]=c[i];
                c[i]=temp;

                digui(c,begin+1,list);

                temp=c[begin];
                c[begin]=c[i];
                c[i]=temp;
            }

        }

    }
    public static void main(String[] args) {
        String str="aba";
        P38_3 test=new P38_3();
        ArrayList<String > list=new ArrayList<>();

        list=test.Permutation(str);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }


}
