import java.util.Stack;

public class P30 {

    Stack<Integer> stack=new Stack<>();
    Stack<Integer> stackmin=new Stack<>();


    public void push(int node) {
        stack.push(node);
        if(stackmin.isEmpty()){
            stackmin.push(node);
        }
        else{
            if(stackmin.peek()>=node){
                stackmin.push(node);
            }
            else{
                stackmin.push(stackmin.peek());
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


    public static void main(String []args){
//        Stack<Integer> stack=new Stack<>();

        P30 test=new P30();
        test.push(3);
        System.out.println(test.min());

        test.push(4);

        System.out.println(test.min());

        test.push(2);
        System.out.println(test.min());





    }


}
