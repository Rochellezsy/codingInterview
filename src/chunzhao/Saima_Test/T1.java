package chunzhao.Saima_Test;
import java.util.Scanner;

public class T1 {

    public double transfer(String s1, String s2){
        int len=s1.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            char temp='0';
            char c=s1.charAt(i);
            if((c>='0' && c<='9')||(c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                temp='1';
            }
            if(temp==s2.charAt(i)){
                count++;
            }
        }
        return (double) count/len*100;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
//        String s1="@!%12dgsa";
//        String s2="010111100";

        System.out.printf("%.2f%%",new T1().transfer(s1,s2));
    }
}
