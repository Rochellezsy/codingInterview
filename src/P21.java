import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class P21 {
    public void reOrderArray(int [] array) {

        Queue<Integer> ouqueue=new LinkedList<>();
        Queue<Integer> jiqueue=new LinkedList<>();

        for(int i=0;i<array.length;i++){
            if(Math.abs(array[i])%2!=0){
                jiqueue.offer(array[i]);
            }
            else if(Math.abs(array[i])%2==0){
                ouqueue.offer(array[i]);
            }

        }

        int k=0;
        while(!jiqueue.isEmpty()){
            array[k]=jiqueue.poll();
            k++;
        }
        while(!ouqueue.isEmpty()){
            array[k]=ouqueue.poll();
            k++;
        }


    }


}

/*
        if(array.length==0 || array==null){
            return;
        }

        int l=array.length;
        int count=0;

        for(int i=0;i<array.length;i++){
            if(Math.abs(array[i])%2==0){
                int temp=array[i];
                while(i<array.length-1){
                    array[i]=array[i+1];
                }
                array[l]=temp;
            }

        }

 */