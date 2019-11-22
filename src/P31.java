import java.util.Stack;

public class P31 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {

        if(pushA==null||popA==null||popA.length!=pushA.length){
            return false;
        }

        Stack<Integer> stack=new Stack<>();

        int j=0;

        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);

            while(!stack.isEmpty()&& stack.peek()==popA[j]){
                stack.pop();
                j++;
            }

        }
        return stack.isEmpty();


    }

}
