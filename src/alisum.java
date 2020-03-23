import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class alisum {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int L=scanner.nextInt();

        for(int i=L;i<=N;i++){
            if((2*N+i-i*i)%(2*i)==0){
                int start=(2*N+i-i*i)/(2*i);
                for(int j=0;j<i-1;j++){
                    System.out.print(start+j+" ");
                }
                System.out.print(start+i-1);
                return;
            }
        }

        System.out.println("No");

    }
}
