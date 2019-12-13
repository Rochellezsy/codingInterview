import java.util.HashMap;
import java.util.Stack;

public class T9 {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    public void push(int node){
        stack1.push(node);

    }

    public int pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            System.out.println("empty");
        }
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();

    }

}
