public class Structure {
    //构造链表的数据结构
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }

    //功能：往链表尾巴里添加元素值value;
    //输入：要添加的链表，要添加的节点的值；
    //返回：添加完链表的头节点；
    public ListNode addtail(ListNode head,int value){
        //判断链表是否为空
        if(head==null){
            head=new ListNode(value);
            return head;
        }
        else{
            ListNode p=head;
            while(p.next!=null){
                p=p.next;
            }
            p.next=new ListNode(value);
            return head;
        }
    }

    //功能：往链表头添加元素值value;
    //输入：要添加的链表，要添加的节点的值；
    //返回：添加完链表的头节点；
    public ListNode addhead(ListNode head,int value){
        //判断头节点是否为空
        ListNode res=new ListNode(value);
        res.next=head;
        return res;
    }

    //功能：删除头节点；
    //输入：要操作链表；
    //返回：删除完之后的链表的头节点;
    public ListNode deletehead(ListNode head){
        //判断链表是否为空
        if(head==null){
            return null;
        }
        else{
            ListNode newhead=head.next;
            return newhead;
        }

    }

    //功能：删除尾节点；
    //输入：要操作链表；
    //返回：删除完之后的链表的头节点;
    public ListNode deletetail(ListNode head){
        //判断链表是否为空
        if(head==null){
            return null;
        }
        else{
            ListNode slow=head;
            ListNode newhead=slow;
            ListNode fast=head.next;
            while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
            }
            slow.next=null;
            return newhead;
        }
    }

    //功能：删除指定值为value的元素节点，如果链表无这个值的节点，返回原链表
    //功能：如果有一个删除这个节点，如果有多个，删除所有值为value的节点
    //输入：要操作链表；
    //返回：删除完之后的链表的头节点;
    public ListNode deletevalue(ListNode head,int value){
        //判断链表是否为空
        if(head==null){
            return head;
        }
        else{
            ListNode res=new ListNode(0);
            ListNode p=res;
            p.next=head;
            if(p.next!=null){
                if(p.next.val==value){
                    p.next=p.next.next;
                }
                p=p.next;
            }
            return res.next;
        }
    }

    //将链表打印出来
    public void print(ListNode head){
        //判断是否为空链表
        if(head==null){
            System.out.println("该链表是空链表");
            return;
        }

        ListNode p=head;
        while(p!=null){
            System.out.print(p.val+" ");
            p=p.next;
        }
        System.out.println();
    }

    //主函数测试
    public static void main(String[] args){

        //创建测试实例test
        Structure test=new Structure();

        //创建测试链表head
        ListNode head=new ListNode(0);
        head.next=new ListNode(1);
        head.next.next=new ListNode(2);

        //用来保存输出结果
        ListNode res;

        //测试链表尾添加元素
        res=test.addtail(head,3);
        test.print(res);
        //print结果应该为：0,1,2,3

        //测试链表头添加元素
        res=test.addhead(head,0);
        res=test.addhead(res,0);
        test.print(res);
        //print结果应该为：0,0,0,1,2,3

        //测试删除链表头
        res=test.deletehead(head);
        test.print(res);
        //print结果应该为：0，0，1，2，3

        //测试删除链表尾
        res=test.deletetail(head);
        test.print(res);
        //print结果应该为:0,0,1,2

        //测试删除指定值
        res=test.deletevalue(head,0);
        test.print(res);
        //print结果应该为1，2

    }
}
