import java.util.Stack;

public class T30 {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stackmin=new Stack<>();

    public void push(int node) {
        stack.push(node);
        if(stackmin.isEmpty()){
            stackmin.push(node);
        }
        else {
            if(node>=stackmin.peek()){
                stackmin.push(stackmin.peek());
            }
            else if(node<stackmin.peek()){
                stackmin.push(node);
            }
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
