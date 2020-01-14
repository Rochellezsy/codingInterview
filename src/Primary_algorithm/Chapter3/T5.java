package Primary_algorithm.Chapter3;

import java.util.ArrayList;
import java.util.List;

public class T5 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int j=list.size()-1;
        int i=0;
        while(i<=j){
            if(!list.get(i).equals(list.get(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        ListNode a1=new ListNode(129);
        ListNode a2=new ListNode(129);


        a1.next=a2;

        T5 test=new T5();
        System.out.println(test.isPalindrome(a1));
    }
}
