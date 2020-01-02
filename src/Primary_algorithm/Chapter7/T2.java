package Primary_algorithm.Chapter7;

import java.util.Stack;

public class T2 {
    Stack<Integer> stack;
    Stack<Integer> stackmin;

    public T2() {
        stack=new Stack<>();
        stackmin=new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(stackmin.isEmpty()){
            stackmin.push(x);
        }
        else if(x<=stackmin.peek()){
            stackmin.push(x);
        }
        else if(x>stackmin.peek()){
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

    public int getMin() {
        return stackmin.peek();
    }
}
