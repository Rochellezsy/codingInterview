public class StackSingleList {
    private SingleLinkedList link;

    public StackSingleList(){
        link=new SingleLinkedList() ;
    }

    public void push(Object obj){
        link.addhead(obj);

    }

    //移除栈顶元素
    public Object pop(){
        Object obj = link.deletehead();
        return obj;
    }

    //判断是否为空
    public boolean isEmpty(){
        return link.isEmpty();
    }

    //打印栈内元素信息
    public void display(){
        link.display();
    }

}
