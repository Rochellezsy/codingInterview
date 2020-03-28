package Sort_algorithm;

public class HeapSort {
    int size;
    int[]a;
    HeapSort(int capacity){
        this.size=0;
        this.a=new int[capacity+1];
        a[0]=Integer.MAX_VALUE;
    }

    public boolean isEmpty(){
        if(size==0){
            System.out.println("Heap is Empty");
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(size==a.length-1){
            System.out.println("Heap is Full");
            return true;
        }
        return false;
    }


    public boolean insert(int value){
        if(isFull()){
            System.out.println("Sorry, Heap is full, can not insert");
            return false;
        }
        else{
            size++;
            a[size]=value;
            int i=size;

            while(a[i]>a[i/2]){
                swap(a,i,i/2);
                i=i/2;
            }
            return true;
        }
    }

    public boolean pop(){
        if(isEmpty()){
            System.out.println("Sorry, Heap is empty, can not pop");
            return false;
        }
        else{
            int temp=a[size];
            size--;

            int parent=1;
            int child=2;
            while(child<size){
                if(a[child]<a[child+1]){
                    child++;
                }
                if(a[parent]>temp){
                    break;
                }
                else{
                    swap(a,parent,child);
                }
                parent=child;
                child=2*parent;
            }
            a[parent]=temp;
            return true;
        }
    }

    public void print(){
        if(isEmpty()){
            System.out.println("堆中无元素");
        }
        else{
            for(int i=1;i<=size;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
        }
    }

    public void swap(int[]a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        HeapSort test=new HeapSort(6);
        int[] nums={10,8,2,5,3,11};
        for(int i=0;i<nums.length;i++){
            test.insert(nums[i]);
        }
        test.print();
        test.pop();
        test.print();
    }

}
