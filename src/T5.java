public class T5 {
    public String replaceSpace(StringBuffer str) {
        StringBuffer res=new StringBuffer();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                res.append("%");
                res.append("2");
                res.append("0");
            }
            else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {
        T5 test=new T5();
        StringBuffer str=new StringBuffer("hello world");

        System.out.println(test.replaceSpace(str));

    }
}
