package Morgen;

public class T1 {
    public static long getIdealNums(long low, long high) {
        // Write your code here
        long ans=0;
        for(long i=low; i<=high; i++){
            if((i%3==0 || i%5==0) && judge(i)){
                ans++;
            }
        }
        return ans;
    }



    public static boolean judge(long n){
        if(n==1)return true;
        if(n%15==0){
            return judge(n/15);
        }
        else if(n%3==0){
            return judge(n/3);
        }
        else if(n%5==0){
            return judge(n/5);
        }
        else{
            return false;
        }
    }

//    public static int ways(int total, int k) {
//        // Write your code here
//        if(total==1 || k==1)return 1;
//        if(total<=k){
//            return (int)getnum(total)%1000000007;
//        }
//        else {
//            return (int)getnum2(total,k)%1000000007;
//        }
//    }
//    public static long getnum(int total){
//        long a=1;
//        for(int i=2;i<=total;i++){
//            a=a*2;
//        }
//        return a;
//    }

    public static void main(String[] args) {
        System.out.println(new T1().getIdealNums(1,10));
    }
}
