public class P91 {
    public int numDecodings(String s) {
        int n=s.length();
        int[] result=new int[n+1];

        result[n]=1;
        result[n-1]=s.charAt(n-1)=='0'?0:1;

        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='0')continue;
            if(Integer.parseInt(s.substring(i,i+2))<=26){
                result[i]=result[i+1]+result[i+2];
            }
            else {
                result[i]=result[i+1];
            }
        }
        return result[0];
    }
}
