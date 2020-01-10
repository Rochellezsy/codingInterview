package Primary_algorithm.Chapter2;

public class T8 {
    public String countAndSay(int n) {
        String str="1";

        for(int i=2;i<=n;i++){
            int count=1;
            StringBuilder builder=new StringBuilder();
            char pre=str.charAt(0);
            for(int j=1;j<str.length();j++){
                char c=str.charAt(j);
                if(c==pre){
                    count++;
                }
                else {
                    builder.append(count).append(pre);
                    pre=c;
                    count=1;
                }
            }
            builder.append(count).append(pre);
            str=builder.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        T8 test=new T8();
        System.out.println(test.countAndSay(5));
    }

}
