public class Main {

    public static void main(String[] args) {
        String a=new String("aaa");
        String b="aaa";
        a.intern();
        System.out.println(a.equals(b));
        System.out.println(a==b);
    }
}
