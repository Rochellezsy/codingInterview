import java.util.Scanner;

public class Dajiang2 {
    public String removeKDigits(String s,int K) {
        String ans=s;
        for (int i = 0; i < K; i++) {
            boolean flag = false;
            //从左向右遍历，找到比自己右侧数字大的数字并删除
            for (int j = 0; j < ans.length()-1; j++) {
                if(ans.charAt(j)>ans.charAt(j+1)) {
                    ans=ans.substring(0,j)+ans.substring(j+1);
                    flag=true;
                    break;
                }
            }
            //如果没有找到要删除的数字，则删除最后一个数字
            if(!flag) {
                ans=ans.substring(0,ans.length()-1);
            }
            //清除整数左侧的数字0
            for (int k = 0; k < ans.length()-1; k++) {
                if(ans.charAt(0)!='0') {
                    break;
                }
                ans=ans.substring(1);
            }
        }
        //如果整数的所有数字都被删除了，直接返回0
        if(ans.length()==0) {
            return "0";
        }
        return ans;
    }

    public static void main(String[] args) {
        Dajiang2 test = new Dajiang2();
        Scanner scanner=new Scanner(System.in);
        String s = scanner.next();
        int K = scanner.nextInt();
        System.out.println(test.removeKDigits(s, K));
    }
}
