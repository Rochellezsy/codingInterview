package qiuzhao.pony;

import java.util.Scanner;
import java.util.Stack;

public class Main3 {

    public int getnum(int n, int[] a){
        int ans=0;
        int min = a[0];
        Stack<Integer>stack = new Stack<>();
        int i=0;
        while(i<n){
            if(stack.isEmpty() || a[i]<stack.peek()){
                stack.add(a[i]);
                i++;
            }
            else{
                int temp = stack.peek();
                Stack<Integer>fu = new Stack<>();
                fu.add(temp);
                int j = i;
                while(fu.isEmpty() || a[j]>fu.peek()){
                    fu.add(a[j]);
                    j++;
                }
                int maxtemp = fu.peek();
                int mintemp = maxtemp;
                while (!fu.isEmpty() || a[j]<temp){
                    mintemp = fu.pop();
                }
                ans += maxtemp - mintemp;






            }
        }


        return ans;
    }

    public static void main(String[] args) {
        Main3 test= new Main3();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[]a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }
        System.out.println(test.getnum(n, a));

    }
}
