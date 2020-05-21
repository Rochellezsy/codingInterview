import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P1249 {
    public String minRemoveToMakeValid(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Integer> stack=new Stack<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='('){
                stack.add(i);
            }
            else if(s.charAt(i)==')' && !stack.isEmpty()){
                stack.pop();
            }
            else if(s.charAt(i)==')' && stack.isEmpty()){
                list.add(i);
            }
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)!='(' && s.charAt(i)!=')'){
                ans.append(s.charAt(i));
            }
            else if(!list.contains(i)){
                ans.append(s.charAt(i));
            }
        }
        return String.valueOf(ans);
    }
}
