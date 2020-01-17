package Primary_algorithm.Chapter9;

import java.util.Stack;

public class T5 {
    public boolean isValid(String s) {
        Stack <Character> stack=new Stack<>();
        if(s.length()%2!=0){
            return false;
        }

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(!stack.isEmpty()&&s.charAt(i)==')' && stack.peek()=='('){
                stack.pop();
            }
            else if(!stack.isEmpty()&&s.charAt(i)==']' && stack.peek()=='['){
                stack.pop();
            }
            else if(!stack.isEmpty()&&s.charAt(i)=='}' && stack.peek()=='{'){
                stack.pop();
            }
            else {
                stack.push(s.charAt(i));
            }

        }

        return stack.isEmpty();

    }

    public static void main(String[] args) {
        T5 test=new T5();
        System.out.println(test.isValid("(]])"));
    }
}
