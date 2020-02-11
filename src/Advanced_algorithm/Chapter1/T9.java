package Advanced_algorithm.Chapter1;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class T9 {
    public int calculate(String s) {
        StringBuilder builder=new StringBuilder();
        Stack<Integer>stack=new Stack<>();
        List<String>list=new ArrayList<>();
        szhuanlist(s,list);
        int size=list.size();
        List<String>newlist=new ArrayList<>();
        for(int i=0;i<size;i++){
            if(!list.get(i).equals("+") && !list.get(i).equals("-") && !list.get(i).equals("*") && !list.get(i).equals("/")){
                stack.push(Integer.valueOf(list.get(i)));
                newlist.add(list.get(i));
            }
            else if(list.get(i).equals("*")||list.get(i).equals("/")){
                newlist.remove(i-1);
                Integer a=stack.pop();
                Integer b=Integer.valueOf(list.get(i+1));
                if(list.get(i).equals("*")){
                    Integer ans=a*b;
                    stack.push(ans);
                    newlist.add(String.valueOf(ans));
                }
                else if(list.get(i).equals("/")){
                    Integer ans=a/b;
                    stack.push(ans);
                    newlist.add(String.valueOf(ans));
                }
                i++;
            }
        }

        int newsize=newlist.size();
        int result=0;
        for(int i=0;i<newsize;i++){
            if(newlist.get(i).equals("+")||newlist.get(i).equals("-")){
                if(newlist.get(i).equals("+")){
                    result=result+Integer.parseInt(newlist.get(i-1))+Integer.parseInt(newlist.get(i+1));
                    i++;
                }
                else if(newlist.get(i).equals("-")){
                    result=result+Integer.parseInt(newlist.get(i-1))-Integer.parseInt(newlist.get(i+1));
                    i++;
                }
            }
        }
        return result;

    }


    public void szhuanlist(String s,List<String>list){
        for(int i=0;i<s.length();i++){
            int temp=i;
            while(s.charAt(i)!='+'&&s.charAt(i)!='-'&&s.charAt(i)!='*'&&s.charAt(i)!='/'){
                i++;
            }
            String szi=s.substring(temp,i);
            list.add(szi);
            if(s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/'){
                list.add(String.valueOf(s.charAt(i)));
            }
        }
    }

    public static void main(String[] args) {

    }

}
