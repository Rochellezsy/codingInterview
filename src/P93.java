import java.util.ArrayList;
import java.util.List;

public class P93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> list=new ArrayList<>();
        int len=s.length();
        for(int a=1;a<4;a++){
            for(int b=1;b<4;b++){
                for(int c=1;c<4;c++){
                    for(int d=1;d<4;d++){
                        if(a+b+c+d==len){
                            int n1=Integer.parseInt(s.substring(0,a));
                            int n2=Integer.parseInt(s.substring(a,a+b));
                            int n3=Integer.parseInt(s.substring(a+b,a+b+c));
                            int n4=Integer.parseInt(s.substring(a+b+c,len));
                            if(judge(n1)&&judge(n2)&&judge(n3)&&judge(n4)){
                                StringBuilder ans=new StringBuilder();
                                ans.append(n1).append('.').append(n2).append('.').append(n3).append('.').append(n4);
                                if(ans.length()==s.length()+3){
                                    list.add(String.valueOf(ans));
                                }
                            }
                        }

                    }
                }
            }
        }
        return list;
    }

    public boolean judge(int n){
        if(n>=0 && n<=255){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s="010010";
        P93 test=new P93();
        test.restoreIpAddresses(s);
    }
}
