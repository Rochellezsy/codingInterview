public class P5171 {
    public int[] closestDivisors(int num) {
        int ans1;
        ans1=result(num+1)[1]-result(num+1)[0];
        int ans2;
        ans2=result(num+2)[1]-result(num+2)[0];
        if(ans1<=ans2){
            return result(num+1);
        }
        else {
            return result(num+2);
        }
    }

    public int[] result(int x){
        int[] res=new int[2];
        int i=(int)Math.sqrt(x);
        int j=(int)Math.sqrt(x);
        while(true){
            if(i*j==x){
                res[0]=j;
                res[1]=i;
                return res;
            }
            else {
                while(x%i!=0){
                    i--;
                }
                j=x/i;
                res[0]=i;
                res[1]=j;
                return res;
            }
        }
    }

    public static void main(String[] args) {
        P5171 test=new P5171();
        System.out.println(test.closestDivisors(123)[0]);
        System.out.println(test.closestDivisors(123)[1]);
    }
}
