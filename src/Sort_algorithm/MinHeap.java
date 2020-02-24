package Sort_algorithm;

public class MinHeap {
    private int[]a;
    private int size;

    //构造方法
    MinHeap(int capacity){
        this.a=new int[capacity+1];
        this.size=0;
        a[0]=Integer.MIN_VALUE;
    }

    //判断堆是否满
    public boolean isfull(){
        return size == a.length;
    }

    //判断堆是否为空
    public boolean iskong(){
        return size==0;
    }

    //插入
    public boolean insert(int value){
        if(isfull()){
            System.out.println("堆已经满了，插入失败");
            return false;
        }else {
            size++;
            a[size]=value;

            int i=size;
            while (a[i]<a[i/2]){
                swap(a,i,i/2);
                i=i/2;
            }
            return true;
        }
    }

    public boolean tuichu(){
        if(iskong()){
            System.out.println("堆已经空了，无法推出");
            return false;
        }
        else {
            int temp=a[size];
            size--;

            int parent=1;
            int child=2;
            while(child<size){
                if(a[child]>a[child+1]){
                    child++;
                }
                if(temp<a[parent]){
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
    }


    //交换函数
    public void swap(int[]a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
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

    public static void main(String[] args) {
        MinHeap test=new MinHeap(6);
        int[] nums={10,8,2,5,3,11};
        for(int i=0;i<nums.length;i++){
            test.insert(nums[i]);
        }
        test.print();
        test.tuichu();
        test.print();

    }


}
