package IO_test;

import java.util.Scanner;

public class T1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        int age=scanner.nextInt();
        String gender=scanner.next();
        System.out.println("name:"+name+"  age:"+age+"  gender:"+gender);

    }
}
