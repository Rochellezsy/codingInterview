import qiuzhao.Aiqiyi.Main;

import java.util.Scanner;

public class Hey {
    public int cc(int b, int c) {
        int k;
        k = b % 10;
        if (b == 0) {
            return 0;
        }
        return (int) (cc(b / 10, c) + Math.pow(k,c));//递归算出每一位的n次方和
    }

    public boolean SXH(int a) {
        int k=a;
        int c=0;
        while (k>0){
            c++;
            k= k / 10;
        }
        //判断是否为水仙花数
        return cc(a, c) == a;
    }

    public static void main(String[] args) {
        Hey test=new Hey();
        Scanner scanner=new Scanner(System.in);
        int num = scanner.nextInt();
        while(true){
            if(test.SXH(num)){
                System.out.print(num+",");
            }
            num++;
        }
    }
}
