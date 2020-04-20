import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P5388 {
    public String reformat(String s) {
        int len=s.length();
        char[]ch=s.toCharArray();
        Arrays.sort(ch);
        StringBuilder res=new StringBuilder();
        int shuzi=0;
        int zimu=0;
        for(int i=0;i<len;i++){
            if(ch[i]>='0'&&ch[i]<='9'){
                shuzi++;
            }
            else{
                zimu++;
            }
        }
        if(Math.abs(shuzi-zimu)>1)return "";
        if(shuzi>zimu){
            int i=0;
            int j=shuzi;
            while(i<shuzi && j<len){
                res.append(ch[i]);
                res.append(ch[j]);
                i++;
                j++;
            }
            if(i==shuzi-1){
                res.append(ch[i]);
            }
        }
        else{
            int i=0;
            int j=shuzi;
            while(i<shuzi && j<len){
                res.append(ch[j]);
                res.append(ch[i]);
                j++;
                i++;
            }
            if(j==len-1){
                res.append(ch[j]);
            }

        }
        return String.valueOf(res);

    }

    public void swap(char[]ch, int i, int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }

    public static void main(String[] args) {
        String s="dgfau1324rdcsv";
        char[]ch=s.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);
    }
}
