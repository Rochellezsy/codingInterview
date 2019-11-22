import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class P38 {


    public ArrayList<String> Permutation(String str){

        ArrayList<String> list = new ArrayList<>();
        if(str!=null && str.length()>0){
            PermutationHelper(str.toCharArray(),0,list);
            Collections.sort(list);
        }
        return list;
    }
    private void PermutationHelper(char[] chars,int i,ArrayList<String> list){
        if(i == chars.length-1){
            list.add(String.valueOf(chars));
        }else{
            Set<Character> charSet = new HashSet<Character>();
            for(int j=i;j<chars.length;++j){
                if(j==i || !charSet.contains(chars[j])){
                    charSet.add(chars[j]);
                    swap(chars,i,j);
                    PermutationHelper(chars,i+1,list);
                    swap(chars,j,i);
                }
            }
        }
    }

    private void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }


/*
//这是不考虑重复的情况
    ArrayList<String> list=new ArrayList<>();
    public ArrayList<String> Permutation(String str) {
        ArrayList<String>list0=new ArrayList<>();
        if(str.length()==0){
            return list0;
        }
        digui(str.toCharArray(),0);
        return list;

    }

    public void digui(char[] str,int begin){

        if(begin==str.length){
            list.add(String.valueOf(str));
        }

        for(int i=begin;i<str.length;i++){
            char temp=str[i];
            str[i]=str[begin];
            str[begin]=temp;

            digui(str,begin+1);

            temp=str[i];
            str[i]=str[begin];
            str[begin]=temp;

        }
    }
*/

    public static void main(String[] args) {
        String str="abc";
        P38 test=new P38();
        ArrayList<String > list=new ArrayList<>();

        list=test.Permutation(str);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }


}
