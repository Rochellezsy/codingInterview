package Intermediate_algorithm.Chapter9;

import java.util.Stack;

public class T2 {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        Integer a;
        Integer b;

        for (String s : tokens) {
            switch (s){
                case "+":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(a+b);
                    break;

                case "-":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(b-a);
                    break;

                case "*":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(a*b);
                    break;

                case "/":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(b/a);
                    break;

                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        }
        return stack.pop();
    }
}
