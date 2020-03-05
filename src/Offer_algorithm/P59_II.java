package Offer_algorithm;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class P59_II {
    Queue<Integer> queue1;
    Deque<Integer> queue2;

    public P59_II() {
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }

    public int max_value() {
        if(queue2.isEmpty()){
            return -1;
        }
        return queue2.peek();
    }

    public void push_back(int value) {
        queue1.add(value);
        if(queue1.isEmpty()){
            queue2.add(value);
        }
        else{
            int count=0;
            while(!queue2.isEmpty() && value>queue2.getLast()){
                queue2.pollLast();
                count++;
            }
            while(count>=0){
                queue2.add(value);
                count--;
            }
        }

    }

    public int pop_front() {
        if(queue1.isEmpty()){
            return -1;
        }
        else {
            queue2.poll();
            return queue1.poll();
        }
    }
}
