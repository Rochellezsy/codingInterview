import java.util.Stack;

public class T30 {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stackmin=new Stack<>();

    public void push(int node) {
        if(stack.isEmpty()){
            stack.push(node);
            stackmin.push(node);
        }
        else if(node<stackmin.peek()){
            stack.push(node);
            stackmin.push(node);
        }
        else if(node>=stackmin.peek()){
            stack.push(node);
            stackmin.push(stackmin.peek());
        }

    }

    public void pop() {
        stack.pop();
        stackmin.pop();

    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return stackmin.peek();
    }
}
