public class P15 {
    public int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        return count;

    }

    public static void main(String[] args) {
        P15 pp=new P15();
        int n=-2;
        int m=2;
        System.out.println(pp.NumberOf1(m));
        System.out.println(pp.NumberOf1(n));


    }



}
