import java.util.Stack;

public class P150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack=new Stack<>();
        int a;
        int b;
        for (String token : tokens) {
            switch(token){
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
                    stack.push(b*a);
                    break;
                case "/":
                    a=stack.pop();
                    b=stack.pop();
                    stack.push(b/a);
                    break;
                default:
                    stack.add(Integer.valueOf(token));
            }

        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[]tokens={"2","1","+","3","*"};
        System.out.println(new P150().evalRPN(tokens));
    }
}
