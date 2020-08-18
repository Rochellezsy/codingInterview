package Heap;

public class test {
    int []a;
    int size;

    public test(int capacity){
        this.a = new int[capacity+1];
        this.size = 0;
        a[0] = Integer.MAX_VALUE;
    }

    public boolean isEmpty(){
        if(size==0){
            System.out.println("heap is Empty!");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(size == a.length-1){
            System.out.println("heap is Full!");
            return true;
        }
        return false;
    }

    public void insert(int val){
        if(isFull()){
            System.out.println("insert failed!");
        }
        size++;
        a[size] = val;
        swim(size);
    }

    public int popMax(){
        if(isEmpty()){
            System.out.println("pop Max failed");
        }
        int temp = a[size];
        size--;
        int max = a[1];
        a[1]=temp;
        sink(1);
        return max;
    }

    public void swim(int k){
        while(k>1 && a[k]>a[k/2]){
            swap(a, k, k/2);
            k=k/2;
        }
    }

    public void sink(int k){
        while(2*k<=size){
            int child=2*k;
            if(child<size && a[child]<a[child+1]){
                child++;
            }
            if(a[child]>a[k]){
                swap(a, k, child);
                k=child;
            }
            else{
                break;
            }
        }
    }

    public void swap(int[]a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public void print(){
        for(int i=1; i<=size; i++){
            System.out.print(a[i] + ",");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test t=new test(6);
        int[] nums={10,8,2,5,3,11};
        for (int num : nums) {
            t.insert(num);
        }
        t.print();
        for(int i=0; i<3; i++){
            System.out.println(t.popMax());
            t.print();
        }
    }


}
