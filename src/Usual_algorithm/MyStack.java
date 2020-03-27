package Usual_algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    Queue<Integer>queue;
    /** Initialize your data structure here. */
    public MyStack() {
        queue=new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int count=queue.size();
        queue.add(x);
        while(count>=1){
            queue.add(queue.poll());
            count--;
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return queue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty() ;
    }
}
