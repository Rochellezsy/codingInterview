package Practice_algorithm;

import Sort_algorithm.MaxHeap;

public class Maxheap {
    int[]a;
    int size;

    Maxheap(int capcacity){
        a=new int[capcacity+1];
        this.size=0;
        a[0]=Integer.MAX_VALUE;
    }

    //判断是否为空
    public boolean iskong(){
        if(size==0){
            return true;
        }
        return false;
    }

    //判断是否为满
    public boolean isfull(){
        if(size==a.length-1){
            return true;
        }
        return false;
    }

    //插入元素
    public boolean insert(int value){
        if(isfull()){
            System.out.println("已经满了，插入失败");
            return false;
        }
        size++;
        a[size]=value;

        int i=size;
        while(a[i]>a[i/2]){
            swap(a,i,i/2);
            i=i/2;
        }
        return true;
    }

    public boolean tuichu(){
        if(iskong()){
            System.out.println("已经空了，推出失败");
            return false;
        }
        int temp=a[size];
        size--;

        int parent=1;
        int child=2;
        while(child<size){
            if(a[child]<a[child+1]){
                child++;
            }

            if(temp>a[parent]){
                break;
            }
            else {
                swap(a,parent,child);
            }
            parent=child;
            child=parent*2;
        }
        a[parent]=temp;
        return true;
    }

    //输出
    public void print(){
        if(iskong()){
            System.out.println("堆中无元素");
        }
        else{
            for(int i=1;i<=size;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

    public void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        Maxheap test=new Maxheap(6);
        int[] nums={10,8,2,5,3,11};
        for(int i=0;i<nums.length;i++){
            test.insert(nums[i]);
        }
        test.print();
        test.tuichu();
        test.print();
    }



}
