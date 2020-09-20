package Heap;

public class Heap {
    int []a;
    int size;

    public Heap(int capacity){
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
        if(a.length-1==size){
            System.out.println("heap is full!");
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
            System.out.println("pop failed");
        }
        int max = a[1];
        int temp = a[size];
        size--;
        a[1] = temp;
        sink(1);
        return max;
    }

    public void swim(int k){
        while(k>1 && a[k]>a[k/2]){
            swap(a, k, k/2);
            k = k/2;
        }

    }

    public void sink(int k){
        while(2*k<=size){
            int child = 2*k;
            if(child<size && a[child]<a[child+1]){
                child++;
            }
            if(a[k]<a[child]){
                swap(a, k, child);
                k = child;
            }
            else{
                break;
            }
        }
    }

    public void swap(int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
