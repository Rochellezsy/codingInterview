package Morgen;

public class T2 {
    public static int ways(int total, int k) {
        // Write your code here
        if(total==1 || k==1)return 1;
        int a=1;
        int b=1;
        for(int i=0;i<total;i++){
            b=b+a;
            a=b-a;
        }
        return b%1000000007;

//        if(total<=k){
//            return (int)getnum(total)%1000000007;
//        }
//        else if(total-k<=k){
////            return (int)getnum2(total,k)%1000000007;
//            return (int)getnum(total)%1000000007;
//        }
//        else{
//            return (int)getnum3(total,k)%1000000007;
//        }
    }


//    public static long getnum2(int total, int k){
//        if(k==1)return 1;
//        long a=1;
//        int index=total-k;
//        for(int i=1;i<index;i++){
//            a=a*2;
//        }
//
//        return a;
//    }
//
//    public static long getnum3(int total, int k){
//        if(k==1)return 1;
//        long a=1;
//        for(int i=2;i<=k;i++){
//            a=a*2;
//        }
//        for(int j=k+1;j<=total;j++){
//            a=2*a-getnum(total-j);
//        }
//        return a;
//    }


    public static void main(String[] args) {
        T2 test=new T2();
//        System.out.println(test.getnum2(5,3) );
        System.out.println(new T2().ways(5,3));
    }


}
